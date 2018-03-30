package com.pibigstar.组合模式;
/**
 * 以下情况下适用组合模式：
　　1．你想表示对象的部分-整体层次结构
　　2．你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 * @author pibigstar
 *
 */
public class Test {

	public static void main(String[] args) {  
		Company root = new ConcreteCompany("北京总公司");  
		root.add(new HRDepartment("总公司人力资源部"));  
		root.add(new FinanceDepartment("总公司财务部"));  

		Company shanghai = new ConcreteCompany("上海华东分公司");  
		shanghai.add(new HRDepartment("上海华东分公司人力资源部"));  
		shanghai.add(new FinanceDepartment("上海华东分公司账务部"));  
		 
		root.add(shanghai);  //将分公司加入总公司下面
		root.display();
	}  

}
