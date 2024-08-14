let checkTimeStamp = new Promise((resolve, reject) => {
    setTimeout(() => {
        let timestamp = Date.now();
        if (timestamp % 2 === 0) {
            resolve(`Timestamp ${timestamp} is even. Promose fulfilled.`);
        } else {
            reject(`Timestamp ${timestamp} is odd. Promose rejected.`);
        }
    }, 1000) ;
});


checkTimeStamp
.then((message) => {
    console.log(message);
})
.catch((error) => { 
    console.error(error);
});