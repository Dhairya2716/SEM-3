const mongoose = require('mongoose');
const express = require('express');
const bodyParser = require('body-parser');
const Client = require('./acc');

mongoose.connect(
  "mongodb+srv://Dhairya:Dh@iry@2716@cluster0.3sfum.mongodb.net/Bank_Managment"
).then(() => {
  const app = express();
  app.use(bodyParser.urlencoded({ extended: false }));
  app.use(bodyParser.json());

  app.post("/Clients", async (req, res) => {
    try {
      const ans = new Client(req.body);
      await ans.save();
      res.send(ans);
    } catch (err) {
      console.log(err);
      res.status(500).send("Error creating client");
    }
  });

  app.get("/Clients", async (req, res) => {
    try {
      const ans = await Client.find();
      res.send(ans);
    } catch (err) {
      console.log(err);
      res.status(500).send("Error fetching clients");
    }
  });

  app.get("/Clients/:Client_id", async (req, res) => {
    try {
      const ans = await Client.findOne({ Client_id: req.params.Client_id });
      if (ans) {
        res.send(ans);
      } else {
        res.status(404).send("Client not found");
      }
    } catch (err) {
      console.log(err);
      res.status(500).send("Error fetching client");
    }
  });

  app.patch("/Clients/:Client_id", async (req, res) => {
    try {
      const ans = await Client.findOne({ Client_id: req.params.Client_id });
      if (ans) {
        ans.Client_id = req.body.Client_id;
        ans.Client_name = req.body.Client_name;
        ans.Acc_no = req.body.Acc_no;
        ans.Amount_acc = req.body.Amount_acc;
        await ans.save();
        res.send(ans);
      } else {
        res.status(404).send("Client not found");
      }
    } catch (err) {
      console.log(err);
      res.status(500).send("Error updating client");
    }
  });

  app.delete("/Clients/:Client_id", async (req, res) => {
    try {
      const ans = await Client.deleteOne({ Client_id: req.params.Client_id });
      res.send(ans);
    } catch (err) {
      console.log(err);
      res.status(500).send("Error deleting client");
    }
  });

  app.listen(3000, () => {
    console.log("Server started");
  });
});