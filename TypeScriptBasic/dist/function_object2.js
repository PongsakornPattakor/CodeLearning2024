"use strict";
const position = { lat: 10, lon: 20 };
const random = () => {
    return {
        lat: parseFloat(Math.random().toFixed(2)),
        lon: parseFloat(Math.random().toFixed(2)),
    };
};
console.log(random());
