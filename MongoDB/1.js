db.comments.aggregate([{
    $lookup: {
        from: 'posts',
        localField: 'post',
        foreignField: '_id',
        as: 'post'
    }
}, {
    $match: {
        "post.title": "Reports a bug in your code"
    }
}, {
    $project: {
        "post": 0,
        "_id": 0
    }
}])