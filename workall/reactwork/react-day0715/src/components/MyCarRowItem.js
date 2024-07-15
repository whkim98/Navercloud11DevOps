import { DeleteForeverOutlined } from '@mui/icons-material';
import axios from 'axios';
import Button from '@mui/material/Button';
import React, { useState } from 'react';
import MyCarList from './MyCarList';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import Slide from '@mui/material/Slide';


const MyCarRowItem = ({idx, row, onDelete}) => {
    const photopath1 = "https://ph9dc3ti3779.edge.naverncp.com/PxOjfBhSlM/mycar";
    const photopath2 = "?type=f&w=40&h=40&faceopt=true&ttype=jpg";

    const storagepath = "https://kr.object.ncloudstorage.com/bitcamp-whkim-123/mycar"

    // const [num, setNum] = useState(0);
    const deleteDataEvent = (num) => {
        let a = window.confirm("해당 상품을 삭제할까요?");
        if(a){
            onDelete(num);
        }
    }

    // const Transition = React.forwardRef(function Transition(props, ref) {
    //     return <Slide direction="up" ref={ref} {...props} />;
    //   });

    const [open, setOpen] = React.useState(false);

    const handleClickOpen = () => {
        setOpen(true);
    };

    const handleClose = () => {
        setOpen(false);
    };

    return (
        <tr style={{fontSize: '14px'}}>
            <td>
                <img alt="photo" src={`${photopath1}/${row.carphoto}${photopath2}`}
                border='1'/>
                <span style={{marginLeft: '5px'}}>{row.carname}</span>
                <Dialog
                    open={open}
                    // TransitionComponent={Transition}
                    keepMounted
                    onClose={handleClose}
                    aria-describedby="alert-dialog-slide-description"
                >
                    <DialogTitle>{"Use Google's location service?"}</DialogTitle>
                    <DialogContent>
                    <DialogContentText id="alert-dialog-slide-description">
                        <img alt="photo" src={`${storagepath}/${row.carphoto}`} style={{maxWidth: '100px'}}/>
                    </DialogContentText>
                    </DialogContent>
                    <DialogActions>
                    <Button onClick={handleClose}>닫기</Button>
                    <Button onClick={handleClose}>Agree</Button>
                    </DialogActions>
                </Dialog>
                <Button variant="outlined" onClick={handleClickOpen}>
                    자세히보기
                </Button>
            </td>
            <td align='right'>{row.carprice}만원</td>
            <td>
                <div style={{backgroundColor: row.carcolor, width: '30px', height: '30px'}}>
                </div>
            </td>
            <td>{row.carguip}</td>
            <td>
                
                <span style={{color: 'gray', fontSize: '13px'}}>
                    {row.writeday}
                    &nbsp;
                    <DeleteForeverOutlined style={{cursor: 'pointer'}} 
                    onClick={() => deleteDataEvent(row.num)}/>
                </span>
            </td>
        </tr>
        
    );
};

export default MyCarRowItem;