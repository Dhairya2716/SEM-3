const mongoose = require("mongoose");

mongoose
  .connect("mongodb+srv://Dhairya:Dh@iry@2716@cluster0.3sfum.mongodb.net/Demo1")
  .then(() => {
    const express = require("express");
    const bodyParser = require("body-parser");

    const students = require("./schema");

    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }));

    app.get("/students", async (req, res) => {
      const ans = await students.find();
      res.send(ans);
    });

    app.get("/students/:id", (req, res) => {
      const ans = schema.findOnce(...req.body).toArray();
      res.send(ans);
    });

    app.listen(3000, () => {
      console.log("server started");
    });
  });