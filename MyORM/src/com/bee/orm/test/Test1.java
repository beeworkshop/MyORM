package com.bee.orm.test;

import java.util.List;

import com.bee.orm.core.Query;
import com.bee.orm.core.QueryFactory;
import com.bee.orm.vo.EmpVO;

public class Test1 {
	public static void main(String[] args) {
		Query q = QueryFactory.createQuery();
		String sql2 = "select e.id,e.empname,salary+bonus 'xinshui',age,d.dname 'deptName',d.address 'deptAddr' from emp e "
				+ "join dept d on e.deptId=d.id ";
		List<EmpVO> list2 = q.queryRows(sql2, EmpVO.class, null);
		for (EmpVO e : list2) {
			System.out.println(e.getEmpname() + "-" + e.getDeptAddr() + "-" + e.getXinshui());
		}

		Query q2 = QueryFactory.createQuery();
		String sql3 = "select e.id,e.empname,salary+bonus 'xinshui',age,d.dname 'deptName',d.address 'deptAddr' from emp e "
				+ "join dept d on e.deptId=d.id ";
		List<EmpVO> list3 = q2.queryRows(sql2, EmpVO.class, null);
		for (EmpVO e : list3) {
			System.out.println(e.getEmpname() + "-" + e.getDeptAddr() + "-" + e.getXinshui());
		}
	}
}