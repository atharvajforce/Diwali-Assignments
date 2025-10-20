package com.demo.service;

import java.util.List;

import com.demo.dao.NumberDao;
import com.demo.dao.NumberDaoImpl;

public class NumberServiceImpl implements NumberService{

	private NumberDao nDao;
	
	
	
public NumberServiceImpl()
{
 nDao =new NumberDaoImpl();	
}
	@Override
	public boolean CheckPrime(int n) {
		return nDao.CheckPrime(n);
	}
	@Override
	public List<Integer> generatePrimes(int n) {
		return nDao.generatePrimes(n);
	}
	@Override
	public long factorial(int n) {
		return nDao.factorial(n);
	}
	@Override
	public List<Integer> fibonacci(int n) {
		return nDao.fibonacci( n);
	}
	@Override
	public boolean isEven(int n) {
		return nDao.isEven(n);
	}

}
