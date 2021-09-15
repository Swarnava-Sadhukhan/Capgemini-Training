db.addresses.find()                             //1

db.addresses.find({},{"restaurant_id":1,"name":1,"borough":1,"cuisine":1})              //2

db.addresses.find({},{"restaurant_id":1,"name":1,"borough":1,"cuisine":1,"_id":0})              //3

db.addresses.find({},{"restaurant_id":1,"name":1,"borough":1,"address.zipcode":1,"_id":0})          //4

db.addresses.find({"borough":"Bronx"}).limit(5)             //5

db.addresses.find({"borough":"Bronx"})                  //6

db.addresses.find({"borough":"Bronx"}).skip(5).limit(5)             //7

db.addresses.aggregate([{
    $unwind: {
        path: "$grades"
    }
}, {
    $group: {
        _id: "$name",
        score: {
            $sum: "$grades.score"
        }
    }
}, {
    $match: {
        "score": {
            $gt: 90
        }
    }
}])                 //8

db.addresses.aggregate(db.addresses.aggregate([{
    $unwind: {
        path: "$grades"
    }
}, {
    $group: {
        _id: "$name",
        score: {
            $sum: "$grades.score"
        }
    }
}, {
    $match: {
        "score": {
            $gt: 90
        }
    }
}]))                    //9

db.addresses.aggregate([{
    $unwind: {
        path: "$grades"
        }
    }, {
        $group: {
            _id: "$name",
            score: {
                $sum: "$grades.score"
            }
    }
}, {
    $match: {
        $and:[
            {"score":{$gt:80}},{"score":{$lt:100}}
        ]
  }}])                  //10


db.addresses.find({"address.coord.0":{$lt:-95.75}})             //11

db.addresses.aggregate([{
    $match: {
        "address.coord.0": {
            $lt: -65.75
        },
        "cuisine": {
            $ne: "American "
        }
    }
}, {
    $unwind: {
        path: "$grades"
    }
}, {
    $group: {
        _id: "$name",
        score: {
            $sum: "$grades.score"
        }
    }
}, {
    $match: {
        "score": {
            $gt: 70
        },

    }
}])                     //12


db.addresses.aggregate([{
    $match: {
        "address.coord.1": {
            $lt: 65.75
        },
        "cuisine": {
            $ne: "American "
        }
    }
}, {
    $unwind: {
        path: "$grades"
    }
}, {
    $group: {
        _id: "$name",
        score: {
            $sum: "$grades.score"
        }
    }
}, {
    $match: {
        "score": {
            $gt: 70
        },

    }
}])                     //13

db.addresses.aggregate([{
    $match: {
        "borough": {
            $ne: "Brooklyn"
        },
        "cuisine": {
            $ne: "American "
        }
    }
}, {
    $unwind: {
        path: "$grades"
    }
}, {
    $match: {
        "grades.grade": "A",

    }
}, {
    $sort: {
        "cuisine": -1
    }
}, {
    $project: {
        "name": 1,
        "cuisine": 1,
        "_id": 0
    }
}])                     //14

db.addresses.find({"name":{$regex:/^Wil/}},{"name":1,"borough":1,"cuisine":1,"_id":0})      //15

db.addresses.find({"name":{$regex:/ces$/}},{"name":1,"borough":1,"cuisine":1,"_id":0})       //16

db.addresses.find({"name":{$regex:"Reg"}},{"name":1,"borough":1,"cuisine":1,"_id":0})       //17

db.addresses.find({"borough":"Bronx","cuisine":{$in:["American ","Chinese"]}})              //18

db.addresses.find({"borough":{$in:["Bronx","Staten Island","Queens","Brooklyn"]}},{"name":1,"borough":1,"cuisine":1,"_id":0})       //19

db.addresses.find({"borough":{$nin:["Bronx","Staten Island","Queens","Brooklyn"]}},{"name":1,"borough":1,"cuisine":1,"_id":0})       //20

db.addresses.aggregate([{
    $unwind: {
        path: "$grades"
    }
}, {
    $group: {
        _id: {
            name: "$name",
            borough: "$borough",
            cuisine: "cuisine"
        },
        score: {
            $sum: "$grades.score"
        }
    }
}, {
    $match: {
        "score": {
            $lte: 10
        }
    }
}])                             //21

db.addresses.find({$or: [{"cuisine":{$nin: ["American ","Chinese"]}},{"name":/^Wil/}]},{"name":1,"cuisine":1,"borough":1})      //22

db.addresses.find({"grades.1.grade":"A","grades.1.score":9,"grades.1.date":new Date("2014-08-11T00:00:00Z")},{"name":1,"cuisine":1,"borough":1})        //24





