const mongoose = require("mongoose");

const nescafe = mongoose.Schema({
  Customer_id: Number,
  Customer_name: String,
  Order_item: String,
  No_of_item: Number,
  Table_no: Number,
  Category: String,
});

// module.exports = mongoose.model("CoffeeShop", nescafe);
module.exports = mongoose.model("CoffeeShop", nescafe, "Customers");