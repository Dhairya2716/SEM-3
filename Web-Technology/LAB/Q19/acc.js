const mongoose = require("mongoose");

const acc = mongoose.Schema({
    Client_id : Number,
    Client_name : String,
    Acc_no : Number,
    Amount_acc : Number
});

module.exports = mongoose.model("Bank_Managment", acc, "Clients");