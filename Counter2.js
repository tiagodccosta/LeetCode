/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let currentValue = init;

    const increment = () => {
        currentValue += 1;
        return currentValue;
    };

    const decrement = () => {
        currentValue -= 1;
        return currentValue;
    };

    const reset = () => {
        currentValue = init;
        return currentValue;
    };

    return { increment, decrement, reset };
};


const counter = createCounter(5)
counter.increment();
counter.reset();
counter.decrement();
