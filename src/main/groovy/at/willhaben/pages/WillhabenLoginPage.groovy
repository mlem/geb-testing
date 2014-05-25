package at.willhaben.pages

import geb.Page

class WillhabenLoginPage extends Page {

    static at = { logonForm }

    static content = {
        logonForm { $('#logonForm') }
    }

}
