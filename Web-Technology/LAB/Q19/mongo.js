const mongoose = require("mongoose");
const express = require("express");
const bodyParser = require("body-parser");
const Students = require("./schema");

mongoose
  .connect("mongodb+srv://Dhairya:Dh%40iry%402716@cluster0.3sfum.mongodb.net/Demo1")
  .then(() => {
    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }));
    app.use(bodyParser.json());

    app.get("/students", async (req, res) => {
      try {
        const ans = await Students.find();
        res.send(ans);
      } catch (err) {
        console.error(err);
        res.status(500).send("Error fetching students");
      }
    });

    app.get('/students/:id', async (req, res) => {
      try {
        const student = await Students.findOne({ id: req.params.id });
        if (student) {
          res.send(student);
        } else {
          res.status(404).send('not found');
        }
      } catch (err) {
        console.error(err);
        res.status(500).send("Error fetching student");
      }
    });

    app.post('/students', async (req, res) => {
      try {
        if (!req.body.name || !req.body.age) {
          res.status(400).send("Name and age are required");
          return;
        }
        const student = new Students(req.body);
        await student.save();
        res.send(student);
      } catch (err) {
        console.error(err);
        res.status(500).send("Error creating student");
      }
    });

    app.patch('/students/:id', async (req, res) => {
      try {
        if (!req.body.name || !req.body.age) {
          res.status(400).send("Name and age are required");
          return;
        }
        const student = await Students.findOne({ id: req.params.id });
        if (student) {
          student.id = req.body.id;
          student.name = req.body.name;
          student.age = req.body.age;
          await student.save();
          res.send(student);
        } else {
          res.status(404).send('not found');
        }
      } catch (err) {
        console.error(err);
        res.status(500).send("Error updating student");
      }
    });

    app.delete('/students/:id', async (req, res) => {
      try {
        const ans = await Students.deleteOne({ id: req.params.id });
        res.send(ans);
      } catch (err) {
        console.error(err);
        res.status(500).send("Error deleting student");
      }
    });

    app.listen(3000, () => {
      console.log("server started");
    });
  })
  .catch(err => {
    console.error(err);
    process.exit(1);
  });