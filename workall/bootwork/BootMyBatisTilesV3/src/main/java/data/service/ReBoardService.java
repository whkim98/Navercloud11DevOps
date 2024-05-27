package data.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
}
