package at.willhaben.pages.marktplatz

import geb.Page

class WillhabenPrivatGewerblichAuswahlPage extends Page {

    static at = { $('.adinput-frontpage-adtypes-doublebox') }

    static content = {
        boxes { $('.adinput-frontpage-adtypes-box') }
        leftBox { boxes[0] }
        privatanzeigeKostenlosLink { leftBox.find('a') }
    }
}
