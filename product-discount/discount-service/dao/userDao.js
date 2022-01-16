const User = require('../model/userModel');

var userDao = {
    findById: findById
}

async function findById(userId) {
    return await User.findOne({ where: {id: userId}})
}

module.exports = userDao;