package data.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.ReBoardDto;
import data.mapper.ReBoardMapperInter;

@Service
public class ReBoardService {

	@Autowired
	private ReBoardMapperInter boardMapper;
	
	public int getMaxNum() {
		return boardMapper.getMaxNum();
	}
	
	public void updateRestep(int regroup, int restep) {
		Map<String, Integer> map = new HashMap<>();
		map.put("regroup", regroup);
		map.put("restep", restep);
		boardMapper.updateRestep(map);
	}
	
	public void insertBoard(ReBoardDto dto) {
		int num = dto.getNum();
		int regroup = dto.getRegroup();
		int restep = dto.getRestep();
		int relevel = dto.getRelevel();
		
		if(num == 0) {
			regroup = this.getMaxNum() + 1;
			restep = 0;
			relevel = 0;
		}else {
			this.updateRestep(regroup, restep);
			restep+=1;
			relevel+=1;
		}
		
		dto.setRegroup(regroup);
		dto.setRestep(restep);
		dto.setRelevel(relevel);
		
		boardMapper.insertBoard(dto);
	}
	
}
