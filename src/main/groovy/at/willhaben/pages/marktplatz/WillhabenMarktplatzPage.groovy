package at.willhaben.pages.marktplatz

import geb.Page

class WillhabenMarktplatzPage extends Page {

    static url = "kaufen-und-verkaufen/"

    static at = { title ==~ /Nr.1 Kleinanzeigenportal - über \d+ Angebote! Kostenlos inserieren!/ }
}
