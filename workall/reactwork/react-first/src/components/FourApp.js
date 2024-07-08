import { useState } from "react";

const FourApp=()=>{
    const [name, setName] = useState('아이유');
    const [age, setAge]=useState(32);
    const [addr, setAddr] = useState('서울시');
    return(
        <div>
            <h1 className="alert alert-info">FourApp-개인정보변경</h1>
            <table className="table table-bordered" style={{width: '300px'}}>
                <caption align="top">개인정보 출력</caption>
                <tbody>
                    <tr>
                        <th width={100} className="table-success">이름</th>
                        <td>{name}</td>
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
                value={age} onChange={(e)=>setAge(e.target.value)}></input>
                <input type="text" className="form-control" style={{width: '200px'}} placeholder="주소"
                value={addr} onChange={(e)=>setAddr(e.target.value)}></input>
            </div>
        </div>
    )
}
export default FourApp;