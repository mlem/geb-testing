package at.willhaben.pages.marktplatz

import geb.Page

class WillhabenMarktplatzPage extends Page {

    static url = "kaufen-und-verkaufen/"

    static at = { title ==~ /Nr.1 Kleinanzeigenportal - über \d+ Angebote! Kostenlos inserieren!/ }

    static content = {
        sideBarLeft { $('#sidebar-left') }
        advertiseBox { sideBarLeft.find('.advertiseBox') }
        anzeigeAufgebenLink { advertiseBox.find('a') }
    }
}
