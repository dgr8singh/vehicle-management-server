
<%@page import="com.example.track.UserDao"%>
<%@page import="com.example.track.User"%>
<%@page import="com.google.gson.Gson"%>
<%

String vnum=request.getParameter("vnum");
if(vnum!=null){
UserDao ud=new UserDao();
User u=ud.track(vnum);
if(u!=null){
Gson g=new Gson();
//out.print("welcome");
out.print(g.toJson(u));
}else{
out.print("Invalid");
}
}
%>