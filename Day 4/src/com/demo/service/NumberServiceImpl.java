package com.demo.service;
import com.demo.dao.*;
public class NumberServiceImpl implements NumberService {

	private NumberDao nDao;
	
	public NumberServiceImpl()
	{
	nDao =new NumberDaoImpl();	
	}
	
	@Override
	public int PrintTable(int n) {
		return nDao.PrintTable(n);
		
	}

	@Override
	public int TrinaglePattern(int n) {
		return nDao.TrianglePattern(n);
	}

	@Override
	public int SumofDigits(int n) {
		return nDao.SumofDigits(n);
	}

	@Override
	public int CalculateGcd(int n1, int n2) {
		return nDao.CalculateGcd(n1,n2);
	}

	@Override
	public int CalculateLcm(int n1, int n2) {
		return nDao.CalculateLcm(n1,n2);

}
}
