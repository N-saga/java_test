package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ren1bean;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/ren1servlet")
public class ren1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ren1servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//今回は会員登録等のURLにパラメータが表示されたら
		//困る処理なのでgetではなくpostを使用しています。
		//処理の内容によってgetとpostを使い分けてください。
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字コードの設定
		request.setCharacterEncoding("UTF-8");

		//④受け取ったパラメータの取得
		String gakuseki = request.getParameter("gakuseki");;
		String name = request.getParameter("name");


		//⑤受け取ったパラメータからMemberインスタンスを生成し、
		//リクエストスコープへ保存

		ren1bean mb = new ren1bean(gakuseki,name);

		request.setAttribute("member", mb);

		//⑥結果表示JSPへフォワードする。
		String view = "/WEB-INF/view/ren1result.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

}