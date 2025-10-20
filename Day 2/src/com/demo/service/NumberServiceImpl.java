package com.demo.service;

import com.demo.dao.NumberDao;
import com.demo.dao.NumberDaoImpl;

public class NumberServiceImpl implements NumberService {

	
	private NumberDao nDao;
	  public NumberServiceImpl() {
	        nDao = new NumberDaoImpl();
	  }
	@Override
	public int sumofNEven(int n) {
		return nDao.sumofNEven(n);
	}
	@Override
	public int sumofNOdd(int n) {
		return nDao.sumofNOdd(n);
	}
	@Override
	public boolean isPalindrome(int n) {
		return nDao.isPalindrome(n);
	}
	@Override
	public boolean isArmstrong(int n) {
		return nDao.isArmstrong(n);
	}
	@Override
	public int ReverseNum(int n) {
		return nDao.ReverseNum(n);
	}


}
