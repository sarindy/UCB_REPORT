package businessLogicAccountENQ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbTools.DbConnectionManager;
import dbTools.DbUtilities;
import objBeans.AccountENQ;

public class AccountENQBusiness {

	/*
	 * This class is the Logic of getting the Account inquiry from the db by
	 * account number
	 */

	private List<AccountENQ> accountENQList;

	public List<AccountENQ> getAccountENQList() {
		return accountENQList;
	}

	public void setAccountENQList(List<AccountENQ> accountENQList) {
		this.accountENQList = accountENQList;
	}

	public AccountENQBusiness(String acctNo) {
		String SPsql = "EXEC OPDYACCTENQUIRY ?";

		Connection conn = DbConnectionManager.getConnection();

		PreparedStatement prepareStatement = null;

		try {

			prepareStatement = conn.prepareStatement(SPsql);
			prepareStatement.setString(1, acctNo);
			ResultSet rs = prepareStatement.executeQuery();

			if (!rs.isBeforeFirst()) {
				System.out.println("No data");
				DbUtilities.closeResultSet(rs);
				DbUtilities.closeStatment(prepareStatement);
				DbUtilities.closeConnection(conn);
			} else {

				List<AccountENQ> accountList = new ArrayList<AccountENQ>();
				while (rs.next()) {
					accountList.add(new AccountENQ(rs.getString(1), rs
							.getString(2), rs.getString(3), rs.getString(4), rs
							.getString(5), rs.getString(6), rs.getString(7), rs
							.getString(8), rs.getString(9)));
				}

				this.accountENQList = accountList;

				DbUtilities.closeResultSet(rs);
				DbUtilities.closeStatment(prepareStatement);
				DbUtilities.closeConnection(conn);

			}

		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
