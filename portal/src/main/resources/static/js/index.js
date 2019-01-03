$(document).ready(function () {
    $("#frebtn").click(function () {
        var times = $("#frequency").val() | 0;
        var resp = -1;
        for (var i = 0; i < times; i++) {
            resp = Math.max($.ajax({ url: "/count", async: false }).responseText, resp);
        }
        $("#result").val(resp);
    });
});