db.zipcodes.find(
    {"city":"ATLANTA","state":"GA"}
    )

db.zipcodes.aggregate([{
    $match: {
        "city": "ATLANTA",
        "state": "GA"
    }
}])

db.zipcodes.aggregate([
    {
        $match: {
            "city":"ATLANTA"
        }
    },
    {
    $group: {
        _id: "$_id"
    }
}, {
    $count: 'count'
}])

db.zipcodes.aggregate([{
    $match: {
        "city": "ATLANTA"
    }
}, {
    $group: {
        _id: "$city",
        fieldN: {
            $sum: "$pop"
        }
    }
}])

db.zipcodes.aggregate([{
    $group: {
        _id: "$city",
        fieldN: {
            $sum: "$pop"
        }
    }
}])

db.zipcodes.aggregate(
    [{
        $group: {
            _id: "$city",
            population: {
                $sum: "$pop"
            }
        }
    }, {
        $sort: {
            population: -1
        }
    }]
)

db.zipcodes.aggregate([{
    $group: {
        _id: "$city",
        population: {
            $sum: "$pop"
        }
    }
}, {
    $sort: {
        population: -1
    }
}, {
    $limit: 3
}])

db.zipcodes.aggregate([{
    $group: {
        _id: {
            "state": "$state",
            "city": "$city"
        },
        population: {
            $sum: "$pop"
        }
    }
}])

db.zipcodes.aggregate([{
    $group: {
        _id: {
            "state": "$state",
            "city": "$city"
        },
        population: {
            $sum: "$pop"
        }
    }
}, {
    $sort: {
        "population": -1
    }
}])

db.zipcodes.aggregate([{
    $group: {
        _id: {
            "state": "$state",
            "city": "$city"
        },
        population: {
            $sum: "$pop"
        }
    }
}, {
    $sort: {
        "population": -1
    }
}, {
    $limit: 3
}])

db.zipcodes.aggregate([{
    $match: {
        "state": "TX"
    }
}, {
    $group: {
        _id: "$city",
        population: {
            $sum: "$pop"
        }
    }
}, {
    $sort: {
        population: -1
    }
}, {
    $limit: 3
}])
