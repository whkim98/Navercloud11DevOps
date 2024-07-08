import { useState } from "react";
import car1 from '../mycar11.png';
import car2 from '../mycar13.png';
import car3 from '../mycar15.png';

const FourApp=()=>{
    const [name, setName] = useState('아이유');
    const [age, setAge]=useState(19);
    const [addr, setAddr] = useState('서울시');
    const [photo, setPhoto] = useState(car1);
    return(
        <div>
            <h1 className="alert alert-info">FourApp-개인정보변경</h1>
            <table className="table table-bordered" style={{width: '400px'}}>
                <caption align="top">개인정보 출력</caption>
                <tbody>
                    <tr>
                        <th width={100} className="table-success">이름</th>
                        <td width={150}>{name}</td>
                        <td rowSpan={3}>
                            <img src={photo} alt="자동차" style={{width: '150px'}}/>
                        </td>
                    </tr>
                    <tr>
                        <th width={100} className="table-success">나이</th>
                        <td>{age}</td>
                    </tr>
                    <tr>
                        <th width={100} className="table-success">주소</th>
                        <td>{addr}</td>
                    </tr>
                </tbody>
            </table>
            <div className="input-group" style={{width: '300px'}}>
                <input type="text" className="form-control" style={{width: '100px'}} placeholder="이름"
                value={name} onChange={(e)=>setName(e.target.value)}></input>
                <input type="text" className="form-control" style={{width: '60px'}} placeholder="나이"
                value={age} onChange={(e)=>setAge(e.target.value)}
                onKeyUp={()=>{
                    if(Number(age) < 20){
                        setPhoto(car1);
                    }else if(Number(age) < 50){
                        setPhoto(car2);
                    }else{
                        setPhoto(car3);
                    }
                }}
                ></input>
                <input type="text" className="form-control" style={{width: '200px'}} placeholder="주소"
                value={addr} onChange={(e)=>setAddr(e.target.value)}></input>
            </div>
        </div>
    )
}
export default FourApp;