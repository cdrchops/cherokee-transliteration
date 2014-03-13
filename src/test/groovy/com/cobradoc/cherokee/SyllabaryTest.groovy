/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/
package com.cobradoc.cherokee

/**
 *
 * @author torr
 * @since 6/20/13
 */
class SyllabaryTest extends GroovyTestCase {
    public void testSyllabary() {
        def su = new SyllabaryUtil();
        assertTrue ('ᎠᎡᎢᎣᎤᎥᎦ' == su.tsalagiToSyllabary('aeiouvga'))
        assertTrue ('ᎧᎨᎩᎪᎫᎬ' == su.tsalagiToSyllabary('kagegigogugv'))
        assertTrue ('ᎳᎴᎵᎶᎷᎸ' == su.tsalagiToSyllabary('lalelilolulv'))
        assertTrue ('ᎹᎺᎻᎼᎽ' == su.tsalagiToSyllabary('mamemimomu'))
        assertTrue ('ᎿᏀ' == su.tsalagiToSyllabary('hnanah'))
        assertTrue ('Ꮝ' == su.tsalagiToSyllabary('s'))
        assertTrue ('ᎾᏁᏂᏃᏄᏅ' == su.tsalagiToSyllabary('naneninonunv'))
        assertTrue ('Ꮎ' == su.tsalagiToSyllabary('na'))
        assertTrue ('ᏆᏇᏈᏉᏊᏋ' == su.tsalagiToSyllabary('quaquequiquoquuquv'))
        assertTrue ('ᏌᏎᏏᏐᏑᏒ' == su.tsalagiToSyllabary('sasesisosusv'))
        assertTrue ('ᏓᏕᏗᏙᏚᏛ' == su.tsalagiToSyllabary('dadedidodudv'))
        //variation of 'du' and 'dv'
        assertTrue ('ᏚᏛ' == su.tsalagiToSyllabary('tutv'))
        assertTrue ('ᏔᏖᏘ' == su.tsalagiToSyllabary('tateti'))
        assertTrue ('ᏣᏤᏥᏦᏧᏨ' == su.tsalagiToSyllabary('jajejijojujv'))
        assertTrue ('Ꮬ' == su.tsalagiToSyllabary('dla'))
        assertTrue ('ᏝᏞᏟᏠᏡᏢ' == su.tsalagiToSyllabary('tlatletlitlotlutlv'))
        assertTrue ('ᏩᏪᏫᏬᏭᏮ' == su.tsalagiToSyllabary('wawewiwowuwv'))
        assertTrue ('ᏯᏰᏱᏲᏳᏴ' == su.tsalagiToSyllabary('yayeyiyoyuyv'))
        assertTrue('ᏀᎿᏀ' == su.tsalagiToSyllabary('nahhnanah'))
        assertTrue('ᎿᏀᎿ' == su.tsalagiToSyllabary('hnanahhna'))

        assertTrue('ᎿᏀᎿ' == su.parseHyphen('hna-nah-hna'));

        assertTrue('ᏣᎳᎩ' == su.tsalagiToSyllabary("tsalagi"))
        assertTrue('ᎠᏆᏚᎵᎭ' == su.tsalagiToSyllabary("aquaduliha"))

        assertTrue('ᏣᎳᎩ' == su.tsalagiToSyllabary("jalagi"))
        assertTrue('ᎠᏆᏚᎵᎭ' == su.tsalagiToSyllabary("agwaduliha"))

        assertTrue('ᏞᏟᏠᏡᏢ' == su.tsalagiToSyllabary("tletlitlotlutlv"))
        assertTrue('ᏞᏟᏠᏡᏢ' == su.tsalagiToSyllabary("dledlidlodludlv"))
        assertTrue su.tsalagiToSyllabary("tletlitlotlutlv")  == su.tsalagiToSyllabary("dledlidlodludlv")
        assertTrue('ᏓᏩᏙᎠ' == su.tsalagiToSyllabary("dawatoa"))
        assertTrue('ᏓᏩᏙᎠ' == su.tsalagiToSyllabary("dawadoa"))
        assertTrue(su.tsalagiToSyllabary("dawadoa") == su.tsalagiToSyllabary("dawatoa"))

        assertTrue('ᏓᏩᏙᎠ' == su.parseHyphen('da-wa-to-a'));

        assertTrue('ᏒᎦᏔ' == su.tsalagiToSyllabary('svgata'))
        assertTrue('Ꮢ##Ꮤ' == su.tsalagiToSyllabary('svkta'))
        assertTrue('ᏒᏍᏒᎪ' == su.tsalagiToSyllabary('svssvgo'))
    }

    public void testPhrases() {
        def su = new SyllabaryUtil();
        assertTrue('ᏣᎳᎩ' == su.tsalagiToSyllabary('jalagi'))
        assertTrue('ᏣᎳᎩᏍᎩ' == su.tsalagiToSyllabary('jalagisgi'));
        assertTrue('ᏙᎾᏓᎪᎲᎢ' == su.tsalagiToSyllabary('donadagohvi'));
        assertTrue('ᏙᏓᏓᎪᎲᎢ' == su.tsalagiToSyllabary('dodadagohvi'));
    }

    public void testSyllabaryParsing() {
        def su = new SyllabaryUtil();
        assertTrue('tletlitlotlutlv' == su.parseSyllabary('ᏞᏟᏠᏡᏢ'));
    }

    public void testSentences() {
        def su = new SyllabaryUtil();
        def TEXT = 'saquu ayotli agikaha.'
        assertTrue('ᏌᏊ ᎠᏲᏟ ᎠᎩᎧᎭ.' == su.tsalagiToSyllabary(TEXT));
        assertTrue('ᏌᏊ ᎠᏲᏟ ᎠᎩᎧᎭ.' == su.tsalagiToSyllabary('sa-quu a-yo-tli a-gi-ka-ha.'))

    }

//    public void testBadInput() {
//        def su = new SyllabaryUtil();
//
////        println su.tsalagiToSyllabary("%")
//
//        assertTrue('not a valid letter' == su.tsalagiToSyllabary('k'))
//        assertTrue('not a valid letter' == su.tsalagiToSyllabary('l'))
//        assertTrue("not a valid letter" == su.tsalagiToSyllabary('m'))
//        assertTrue("not a valid letter" == su.tsalagiToSyllabary('n'))
//        assertTrue("not a valid letter" == su.tsalagiToSyllabary('q'))
//        assertTrue("not a valid letter" == su.tsalagiToSyllabary('t'))
//        assertTrue("not a valid letter" == su.tsalagiToSyllabary("w"))
//
//
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary('ly'))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary('my'))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary('ny'))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary('qy'))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary('tl'))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary("ty"))
//        assertTrue("not a valid letterᏍ" == su.tsalagiToSyllabary("ts"))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary("wy"))
//        assertTrue("not a valid letternot a valid letter" == su.tsalagiToSyllabary("yy"))
//
//
//        assertTrue("not a valid letterᏍnot a valid letter" == su.tsalagiToSyllabary("tsy"))
//
//        assertTrue("not a valid letternot a valid letternot a valid letter" == su.tsalagiToSyllabary('tly'))
//        assertTrue("not a valid letterᎤnot a valid letter" == su.tsalagiToSyllabary('quy'))
//    }

    public void testReverseReplace() {
        def su = new SyllabaryUtil();
        assertTrue("gwa" == su.reverseReplace("qua"))

        assertTrue("gwe" == su.reverseReplace("que"))
        assertTrue("gwi" == su.reverseReplace("qui"))
        assertTrue("gwo" == su.reverseReplace("quo"))
        assertTrue("gwu" == su.reverseReplace("quu"))
        assertTrue("gwv" == su.reverseReplace("quv"))
        assertTrue("ja" == su.reverseReplace("tsa"))
        assertTrue("je" == su.reverseReplace("tse"))
        assertTrue("ji" == su.reverseReplace("tsi"))
        assertTrue("jo" == su.reverseReplace("tso"))
        assertTrue("ju" == su.reverseReplace("tsu"))
        assertTrue("jv" == su.reverseReplace("tsv"))
        assertTrue("tle" == su.reverseReplace("dle"))
        assertTrue("tli" == su.reverseReplace("dli"))
        assertTrue("tlo" == su.reverseReplace("dlo"))
        assertTrue("tlu" == su.reverseReplace("dlu"))
        assertTrue("tlv" == su.reverseReplace("dlv"))
    }

    public void testReplace() {
        def su = new SyllabaryUtil();

        assertTrue("wado" == su.replace("wa-do"));
    }

    public void testCH() {
        def su = new SyllabaryUtil();
        assertTrue("jv" == su.reverseReplace("chv"));
        assertTrue("ᎠᏂᏨᏯ" == su.tsalagiToSyllabary("anichvya"));
    }

    public void testDurbinFeelingSpellings() {
        def su = new SyllabaryUtil();
        assertTrue("ᏯᏖᎾ" == su.tsalagiToSyllabary("hyahtena"));
        assertTrue("ᏯᏙᏟ" == su.tsalagiToSyllabary("hyahtohli"));
        assertTrue("ᏰᎦᏟ" == su.tsalagiToSyllabary("hyehgahli"));
        assertTrue("ᎢᎦᎷᎦ" == su.tsalagiToSyllabary("igaluhga"));
        assertTrue("ᏗᏰᎦᏟ" == su.tsalagiToSyllabary("dihyehgahli"));
        assertTrue("ᎥᎤᎷᏨᎢ,ᎤᎷᏨᎢ" == su.tsalagiToSyllabary("vuluhjvi,uluhjvi"));

        assertTrue("ᎯᎳ ᎢᎩᏓ ᎠᎵᏍᏇᏚᏬ ᎭᎵᏍᏇᏚᎲᏍᎩ?" == su.tsalagiToSyllabary("Hila ikida alisgwetuwo halisgwetuhvsgi?"));
        assertTrue("ᏍᎪᎯ ᎢᎳᏏᏗ ᏂᎦᏅᎭ" == su.tsalagiToSyllabary("Sgohi ilasihdi niganvha"));
        assertTrue("ᎢᎸᎯᏳᎢᏍ ᎢᎾᏓ ᏣᎦᏟᏨᎢ" == su.tsalagiToSyllabary("Ilvhiyuis inada tsagahlijvi"));
    }

    public void testNewStuff() {
        def str = "adelohi"
        def su = new SyllabaryUtil()
        su.syllabaryMap2.each {
            str = str.replace(it.key, it.value)
        }

        su.syllabaryMap.each {
            str = str.replace(it.key, it.value)
        }

        assert str == "adelohi"

        def tst = "Ahani <u>dajidi</u> hia suhdi."
        def tstFixed = "ahani <u>datsidi</u> hia sudi."
        def syltest = "ᎠᎭᏂ <u>ᏓᏥᏗ</u> ᎯᎠ ᏑᏗ."

        String tmpTest = su.replace(tst.toLowerCase()).replace("<u>", "##").replace("</u>", "###");
        String tmpSyllTest = syltest;

        su.syllabaryMap2.each {
            tmpTest = tmpTest.replace(it.key, it.value)
        }

        tmpTest = tmpTest.replace("###", "</u>").replace("##", "<u>")
        assert tmpTest == syltest;

        su.syllabaryMap.each {
            tmpSyllTest = tmpSyllTest.replace(it.key, it.value)
        }

        assert tmpSyllTest == tstFixed
    }
}
