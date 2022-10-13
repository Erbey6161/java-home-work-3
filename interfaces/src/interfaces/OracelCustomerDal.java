package interfaces;

public class OracelCustomerDal implements ICustomerDal,IRepository{
	@ Override
	public void Add() {
		System.out.println("Oracle Eklendi");
	}
}
