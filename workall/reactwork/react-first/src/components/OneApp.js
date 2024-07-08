import { Component } from "react";

class OneApp extends Component{
    render(){
        return(
            <div>
                <h1 className="alert alert-danger">OneApp - class 형태</h1>
                <h5>public사진 가져오기</h5>
                <img src="./8.jpg" alt="사진1" width={200}/>
            </div>
        )
    }
}

export {OneApp};