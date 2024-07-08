import './MyStyle.css';

const TwoApp=()=>{
    let message = "have a nice DAY!!";
    return(
        <div>
            <h1 className="alert alert-info">TwoApp - function 형태</h1>
            <div className='msg' style={{backgroundColor: 'orange', border: '10px solid gray'}}>{message}</div>
            <div className='msg' style={{backgroundColor: 'pink', border: '5px 5px 5px gray'}}>{message}</div>
            <div className='msg' style={{border: '10px groove gold', borderRadius: '30px'}}>{message}</div>
        </div>
    )
}

export default TwoApp;