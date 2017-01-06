import geb.Browser

Browser.drive {
    go 'http://gr8conf.in'
    assert title == 'GR8Conf IN-2017'

    $("#header").find("a", text: 'Agenda').click()
    waitFor {
        $(".page-block h1").text() == 'Agenda'
    }
}