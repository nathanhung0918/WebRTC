
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateServlet
 */

public class CreateServlet extends HttpServlet {


	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");

		String roomOwner;
		String room;
		String callTo;

		try {
			roomOwner = request.getParameter("roomOwner");
		} catch (Exception e) {
			roomOwner="0";
		}
		try {
			room = request.getParameter("roomNumber");
		} catch (Exception e) {
			room="0";
		}
		try {
			callTo = request.getParameter("callTo");
		} catch (Exception e) {
			callTo="0";
		}
		if(callTo.equals("")){
			callTo="0";
		}
		Boolean state = false;
		String stat = request.getParameter("state");
		try {
			if (stat.equals("true")) {
				state = true;
			} else {
				state = false;
			}
		} catch (Exception e) {
		}
		// AnswerAnalysis be = new AnswerAnalysis();
		// boolean answer = be.getAnswers(c);
		System.out.println("roomOwner: " + roomOwner + " room: " + room + " callTo: " + callTo + " state: " + state);
		Reader readRoom = new Reader();
		readRoom.read();
		Boolean owner = readRoom.isin(room);
		String checkRoomOwner = readRoom.getOwner();

		if (owner) {
			Writer writeRoom = new Writer();
			writeRoom.setroom(room, roomOwner);
			writeRoom.write();
		}

		request.setAttribute("ID", roomOwner);
		request.setAttribute("Room", room);
		request.setAttribute("Owner", owner);
		request.setAttribute("To", callTo);
		request.setCharacterEncoding("UTF-8");

		if (state) {
			if (!owner) {
				RequestDispatcher view = request.getRequestDispatcher("home.html");				
				//System.out.println("1");
				view.forward(request, response);				
			} else {
				RequestDispatcher view = request.getRequestDispatcher("WebRTCTester.jsp");
				//System.out.println("2");
				view.forward(request, response);
			}
		} else {
			if (owner) {
				RequestDispatcher view = request.getRequestDispatcher("home.html");
				//System.out.println("3");
				view.forward(request, response);
			} else {
				if (callTo.equals(checkRoomOwner)) {
					RequestDispatcher view = request.getRequestDispatcher("WebRTCTester.jsp");
					//System.out.println("4");
					view.forward(request, response);
				} else {
					RequestDispatcher view = request.getRequestDispatcher("home.html");
					//System.out.println("5");
					view.forward(request, response);
				}
			}
		}
	}
	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException {

		try {
			processRequest(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException {

		try {
			processRequest(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
