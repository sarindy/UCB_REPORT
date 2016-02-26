package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objBeans.AccountENQ;
import businessLogicAccountENQ.AccountENQBusiness;

/**
 * Servlet implementation class AccountENQServ
 */
public class AccountENQServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountENQServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String acctNo;
		acctNo=request.getParameter("ACCTNO").toString();
		
		AccountENQBusiness accountENQBusiness=new AccountENQBusiness(acctNo);
		
		out.println("<h1>Account List</h1>");
		Iterator<AccountENQ> iterator =  accountENQBusiness.getAccountENQList().iterator();
		
		AccountENQ accoutObj=new AccountENQ();
		while (iterator.hasNext()) {
			accoutObj = iterator.next();
			out.println("Account No : " + accoutObj.getAcctNo()+"<br>");
			out.println("Customer ID : " + accoutObj.getCustomerID()+"<br>");
			out.println("Account Name : " + accoutObj.getAcctName()+"<br>");
			out.println("Customer Gender : " + accoutObj.getCustGender()+"<br>");
			out.println("Customer Sector : " + accoutObj.getCustSector()+"<br>");
			out.println("Account CCY : " + accoutObj.getAcctCCY()+"<br>");
			out.println("Account Balance : " + accoutObj.getAcctBal()+"<br>");
			out.println("Product : " + accoutObj.getAcctProduct()+"<br>");
			out.println("From Company : " + accoutObj.getAcctCompanyCode()+"<br>");

		}
	}

}
