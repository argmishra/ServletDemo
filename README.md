# ServletDemo - This repo consists of code for the essentials functionality of Servlet.

## There are three ways to create a servlet object :
1. **By implemeting servlet interface** - Need to overdie all abstrct methods
2. **By extending GenericServlet abstract class** - Need to override one abstract method
3. **By extending HttpServlet abstract class** - No overridden method

## Servlet Life Cycle 
1. Servlet class is loaded.
2. Servlet instance is created.
3. init method is invoked.
4. service method is invoked.
5. destroy method is invoked.

## Servlet Working
* Maps the request with the servlet in the web.xml file.
* Creates request and response objects for this request
* Calls the service method on the thread
* The public service method internally calls the protected service method
* The protected service method calls the doGet method depending on the type of request.
* The doGet method generates the response and it is passed to the client.
* After sending the response, the web container deletes the request and response objects. The thread is contained in the thread pool or deleted depends on the server implementation.

## RequestDispatcher
The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp. There are two methods defined in the RequestDispatcher interface.

a. **public void forward(ServletRequest request,ServletResponse response)** : Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.

b. **public void include(ServletRequest request,ServletResponse response)** : Includes the content of a resource (servlet, JSP page, or HTML file) in the response.

## sendRedirect
The sendRedirect() method of HttpServletResponse interface can be used to redirect response to another resource, it may be servlet, jsp or html file.

## ServletConfig Interface
An object of ServletConfig is created by the web container for each servlet. It is easier to manage the web application if any specific content is modified from time to time for each servelt individullay. We don't need to edit the servlet file if information is modified from the web.xml file. If any information is shared to individual servlet, it is better to provide it from the web.xml file using the **<init-param>** element.

## ServletContext Interface
An object of ServletContext is created by the web container at time of deploying the project. There is only one ServletContext object per web application. If any information is shared to many servlet, it is better to provide it from the web.xml file using the **<context-param>** element. It can be used to set, get or remove attribute.

## Session Tracking 
1. **Cookies** -  In cookies technique, we add cookie with response from the servlet. So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with request by default. Thus, we recognize the user as the old user.
2. **Hidden Form Field** - We store the information in the hidden field and get it from another servlet. This approach is better if we have to submit form in all the pages.
3. **URL Rewriting** - In URL rewriting, we append a token or identifier to the URL of the next Servlet or the next resource.
4. **HttpSession** - Container creates a session id for each user.The container uses this id to identify the particular user.

## Servlet with Annotation 
Annotation represents the metadata. If you use annotation, deployment descriptor (web.xml file) is not required.
1. @WebServlet specify name of servlet.
2. @WebFilter specify name of filter.
3. @WebListener specify name of listner.
4. @WebInitParam specify init params for servlet.

Note : http://localhost:8080/ServletDemo/demoAnnotation

## Filter
A filter is an object that is invoked at the preprocessing and postprocessing of a request. The servlet filter is pluggable, i.e. its entry is defined in the web.xml file, if we remove the entry of filter from the web.xml file, filter will be removed automatically and we don't need to change the servlet.

## Miscellaneous 
1. **Load On Start Up** - The load-on-startup element of web-app loads the servlet at the time of deployment or server start if value is positive. It is also known as pre initialization of servlet.
2. **welcome-file-list** - A welcome file is the file that is invoked automatically by the server, if you don't specify any file name.