import { Component } from "react";
import car1 from '../mycar11.png';
import car2 from '../mycar13.png';
import car3 from '../mycar15.png';

class OneApp extends Component{
    render(){
        return(
            <div>
                <h1 className="alert alert-danger">OneApp - class 형태</h1>
                <h5>public사진 가져오기</h5>
                <img src="./8.jpg" alt="사진1" width={200}/>
                <img src="./11.jpg" alt="사진2" style={{width: '200px', border: '5px solid green', 
                    borderRadius: '50px 20px 100px 19px'}}></img>
                <img src={car1} alt="자동차1"/>
                <img src={car2} alt="자동차2"/>
                <img src={car3} alt="자동차3"/>
            </div>
        )
    }
}

export {OneApp};