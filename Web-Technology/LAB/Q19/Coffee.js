const mongoose = require("mongoose");
const express = require("express");
const bodyParser = require("body-parser");
const Customers = require("./nescafe");

mongoose
  .connect(
    "mongodb+srv://Dhairya:Dh%40iry%402716@cluster0.3sfum.mongodb.net/CoffeeShop"
  )
  .then(() => {
    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }));
    app.use(bodyParser.json());

    app.get("/Customers", async (req, res) => {
      try {
        const ans = await Customers.find();
        res.send(ans);
      } catch (err) {
        console.log(err);
        res.status(500).send("Error present");
      }
    });

    app.get("/Customers/:Customers_id", async (req, res) => {
      try {
        const ans = await Customers.findOne({
          Customer_id: req.params.Customers_id,
        });
        if (ans) {
          res.send(ans);
        } else {
          res.status(404).send("Error");
        }
      } catch (err) {
        console.log(err);
        res.status(500).send("Error present");
      }
    });

    app.post("/Customers", async (req, res) => {
      try {
        const newCustomer = new Customers(req.body);
        await newCustomer.save();
        res.send(newCustomer);
      } catch (err) {
        console.log(err);
        res.status(500).send("Error present");
      }
    });

    app.patch("/Customers/:Customer_id",async(req, res) => {
        try{
            const ans = await Customers.findOne({ Customer_id: req.params.Customer_id });
            if(ans){
                ans.Customer_id = req.body.Customer_id;
                ans.Customer_name = req.body.Customer_name;
                ans.Order_item = req.body.Order_item;
                ans.No_of_item = req.body.No_of_item;
                ans.Table_no = req.body.Table_no;
                ans.Category = req.body.Category;
                await ans.save();
                res.send(ans);
            }
            else {
                res.status(404).send('not found');
              }
        }
        catch(err){
            console.error(err);
            res.status(500).send("Error updating");
        }
    });

    app.delete("/Customers/:Customer_id",async(req,res)=>{
        try{
            const ans = await Customers.deleteOne({Customer_id:req.params.Customer_id})
            res.send(ans)
        }
        catch(err){
            console.log(err)
            res.status(500).send("Error deleting");
        }
    })

    app.listen(3000, () => {
      console.log("Server started");
    });
  });