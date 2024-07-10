import React from 'react';

const FiveChild2App = ({photo, msg}) => {
    return (
        <div className='box1'>
            <img alt="phjoto" src={require(`../mycar/${photo}`)} className='small'/>
            {msg}
        </div>
    );
};

export default FiveChild2App;