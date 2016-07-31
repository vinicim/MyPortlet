package br.com.my;

public class MyPortletDao {
	
//	Connection conn = MyConn.getConnection();
//	
//	private static final String SAVE_CONTACT_QUERY = "INSERT INTO contact(CONTACT_NAME, CONTACT_PHONE) VALUES(?,?);";
//	private static final String LIST_CONTACT_QUERY = "SELECT * FROM contact;";
//	
//	public void save(String name, String phone) throws SQLException{
//		
//		PreparedStatement pstmt = conn.prepareStatement(SAVE_CONTACT_QUERY);
//		pstmt.setString(1, name);
//		pstmt.setString(2, phone);
//		pstmt.execute();	
//		
////		MyConn.closeConnection(conn);
//		
//	}
//	
//	public List<Contact> list() throws SQLException{
//		
//		List<Contact> list = new ArrayList<Contact>();
//		Contact contact;
//		
//		PreparedStatement pstmt = conn.prepareStatement(LIST_CONTACT_QUERY);
//		ResultSet rs = pstmt.executeQuery();
//		
//		while(rs.next()){
//			contact = new Contact();
//			String name = rs.getString("CONTACT_NAME");
//			String phone = rs.getString("CONTACT_PHONE");
//			contact.setName(name);
//			contact.setPhone(phone);
//			list.add(contact);
//		}
//		
//		MyConn.closeConnection(conn);
//		return list;
//	}


}
