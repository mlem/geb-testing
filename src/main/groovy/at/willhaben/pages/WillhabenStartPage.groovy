package at.willhaben.pages;

import geb.Page

public class WillhabenStartPage extends Page {

    static url = "http://www.willhaben.at/iad/"

    static at = { title == "Kostenlose Kleinanzeigen, Immobilien, Gebrauchtwagen, Jobs - willhaben.at" }

    static content = {
        navigation { $('#navigation') }
        navigationLinks { navigation.find('a') }
        immobilienLink { navigationLinks[0] }
        autoLink { navigationLinks[1] }
        jobLink { navigationLinks[2] }
        marktplatzLink { navigationLinks[3] }
    }
}
