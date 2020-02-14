let express = require('express');
let app = express();
const port = (process.env.PORT === undefined)? 8085 : process.env.PORT;

const ratings = [
    {
        idReviewer: 1,
        stars: 3,
    },
    {
        idReviewer: 2,
        stars: 4
    }
];

function getRating(idReviewer){
    for (const rating of ratings){
        if (rating.idReviewer === Number(idReviewer)){
            return rating;
        }
    }
    return {};
}

app.get('/ratings/:idReviewer', function (req, res) {
    const idReviewer = req.params.idReviewer;
    res.json(getRating(idReviewer));
});

app.get('/actuator/info', function (req, res) {
    res.json({});
});

let server = app.listen(port, function () {
    let host = server.address().address;
    let port = server.address().port;
    console.log("Example app listening at http://%s:%s", host, port)
});
