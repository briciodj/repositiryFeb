<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceCrudS_RegionProxyid" scope="session" class="org.service.crud.ServiceCrudS_RegionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceCrudS_RegionProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        sampleServiceCrudS_RegionProxyid.consultaGeneralS_product();
break;
case 5:
        gotMethod = true;
        String id_0id=  request.getParameter("id8");
        int id_0idTemp  = Integer.parseInt(id_0id);
        java.lang.String eliminarS_Product5mtemp = sampleServiceCrudS_RegionProxyid.eliminarS_Product(id_0idTemp);
if(eliminarS_Product5mtemp == null){
%>
<%=eliminarS_Product5mtemp %>
<%
}else{
        String tempResultreturnp6 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(eliminarS_Product5mtemp));
        %>
        <%= tempResultreturnp6 %>
        <%
}
break;
case 10:
        gotMethod = true;
        String name_1id=  request.getParameter("name13");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        String short_desc_2id=  request.getParameter("short_desc15");
            java.lang.String short_desc_2idTemp = null;
        if(!short_desc_2id.equals("")){
         short_desc_2idTemp  = short_desc_2id;
        }
        String longtext_id_3id=  request.getParameter("longtext_id17");
        int longtext_id_3idTemp  = Integer.parseInt(longtext_id_3id);
        String suggesed_price_4id=  request.getParameter("suggesed_price19");
        int suggesed_price_4idTemp  = Integer.parseInt(suggesed_price_4id);
        String whlsl_units_5id=  request.getParameter("whlsl_units21");
        int whlsl_units_5idTemp  = Integer.parseInt(whlsl_units_5id);
        String image_id_6id=  request.getParameter("image_id23");
        int image_id_6idTemp  = Integer.parseInt(image_id_6id);
        String id_7id=  request.getParameter("id25");
        int id_7idTemp  = Integer.parseInt(id_7id);
        java.lang.String actalizarS_Product10mtemp = sampleServiceCrudS_RegionProxyid.actalizarS_Product(name_1idTemp,short_desc_2idTemp,longtext_id_3idTemp,suggesed_price_4idTemp,whlsl_units_5idTemp,image_id_6idTemp,id_7idTemp);
if(actalizarS_Product10mtemp == null){
%>
<%=actalizarS_Product10mtemp %>
<%
}else{
        String tempResultreturnp11 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(actalizarS_Product10mtemp));
        %>
        <%= tempResultreturnp11 %>
        <%
}
break;
case 27:
        gotMethod = true;
        String id_8id=  request.getParameter("id30");
        int id_8idTemp  = Integer.parseInt(id_8id);
        String name_9id=  request.getParameter("name32");
            java.lang.String name_9idTemp = null;
        if(!name_9id.equals("")){
         name_9idTemp  = name_9id;
        }
        String short_desc_10id=  request.getParameter("short_desc34");
            java.lang.String short_desc_10idTemp = null;
        if(!short_desc_10id.equals("")){
         short_desc_10idTemp  = short_desc_10id;
        }
        String longtext_id_11id=  request.getParameter("longtext_id36");
        int longtext_id_11idTemp  = Integer.parseInt(longtext_id_11id);
        String suggesed_price_12id=  request.getParameter("suggesed_price38");
        int suggesed_price_12idTemp  = Integer.parseInt(suggesed_price_12id);
        String whlsl_unit_13id=  request.getParameter("whlsl_unit40");
        int whlsl_unit_13idTemp  = Integer.parseInt(whlsl_unit_13id);
        String image_id_14id=  request.getParameter("image_id42");
        int image_id_14idTemp  = Integer.parseInt(image_id_14id);
        java.lang.String agregarS_Product27mtemp = sampleServiceCrudS_RegionProxyid.agregarS_Product(id_8idTemp,name_9idTemp,short_desc_10idTemp,longtext_id_11idTemp,suggesed_price_12idTemp,whlsl_unit_13idTemp,image_id_14idTemp);
if(agregarS_Product27mtemp == null){
%>
<%=agregarS_Product27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(agregarS_Product27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>