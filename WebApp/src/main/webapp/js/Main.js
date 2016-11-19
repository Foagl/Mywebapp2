
var main = {
    login: function () {
        var log = $("#log").val();
        var pass = $("#pass").val();
        var request = {};
        request.log = log;
        request.pass = pass;
        request.requestType = "login";
        $.ajax({ ///////////////////////
            type: "POST",
            url: "/hello",
            dataType: "json",
            data: request,
            success: function (response) {
                console.log(response.key);
                var url = "http://localhost:8080/mainmenu.html";
                window.open(url);
            }
        }); ////////////////
    }}

var next = {
    site: function () {
        var url = "http://localhost:8080/mainmenu.html";
        window.open(url);
    }
}