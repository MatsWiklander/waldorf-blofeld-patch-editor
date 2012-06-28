package main.java.models.arpeggiator;

import main.java.utils.EnumConverter;
import main.java.utils.ReverseEnumMap;

public enum Tempos implements EnumConverter<Tempos> {
        BPM40(0, "40"), BPM42(1, "42"), BPM44(2, "44"), BPM46(3, "46"), BPM48(
                        4, "48"), BPM50(5, "50"), BPM52(6, "52"), BPM54(7, "54"), BPM56(
                        8, "56"), BPM58(9, "58"), BPM60(10, "60"), BPM63(11,
                        "63"), BPM65(12, "65"), BPM67(13, "67"), BPM69(14, "69"), BPM71(
                        15, "71"), BPM73(16, "73"), BPM75(17, "75"), BPM77(18,
                        "77"), BPM79(19, "79"), BPM81(20, "81"), BPM83(21, "83"), BPM85(
                        22, "85"), BPM87(23, "87"), BPM89(24, "89"), BPM91(25,
                        "91"), BPM93(26, "93"), BPM95(27, "95"), BPM97(28, "97"), BPM99(
                        29, "99"), BPM101(30, "101"), BPM103(31, "103"), BPM106(
                        32, "106"), BPM108(33, "108"), BPM110(34, "110"), BPM112(
                        35, "112"), BPM114(36, "114"), BPM116(37, "116"), BPM118(
                        38, "118"), BPM120(39, "120"), BPM122(40, "122"), BPM124(
                        41, "124"), BPM126(42, "126"), BPM128(43, "128"), BPM130(
                        44, "130"), BPM132(45, "132"), BPM134(46, "134"), BPM136(
                        47, "136"), BPM138(48, "138"), BPM140(49, "140"), BPM142(
                        50, "142"), BPM144(51, "144"), BPM146(52, "146"), BPM149(
                        53, "149"), BPM151(54, "151"), BPM153(55, "153"), BPM155(
                        56, "155"), BPM157(57, "157"), BPM159(58, "159"), BPM161(
                        59, "161"), BPM163(60, "163"), BPM165(61, "165"), BPM167(
                        62, "167"), BPM169(63, "169"), BPM171(64, "171"), BPM173(
                        65, "173"), BPM175(66, "175"), BPM177(67, "177"), BPM179(
                        68, "179"), BPM181(69, "181"), BPM183(70, "183"), BPM185(
                        71, "185"), BPM187(72, "187"), BPM189(73, "189"), BPM191(
                        74, "191"), BPM194(75, "194"), BPM196(76, "196"), BPM198(
                        77, "198"), BPM200(78, "200"), BPM202(79, "202"), BPM204(
                        80, "204"), BPM206(81, "206"), BPM208(82, "208"), BPM210(
                        83, "210"), BPM212(84, "212"), BPM214(85, "214"), BPM216(
                        86, "216"), BPM218(87, "218"), BPM220(88, "220"), BPM222(
                        89, "222"), BPM224(90, "224"), BPM226(91, "226"), BPM228(
                        92, "228"), BPM230(93, "230"), BPM232(94, "232"), BPM234(
                        95, "234"), BPM237(96, "237"), BPM239(97, "239"), BPM241(
                        98, "241"), BPM243(99, "243"), BPM245(100, "245"), BPM247(
                        101, "247"), BPM249(102, "249"), BPM251(103, "251"), BPM253(
                        104, "253"), BPM255(105, "255"), BPM257(106, "257"), BPM259(
                        107, "259"), BPM261(108, "261"), BPM263(109, "263"), BPM265(
                        110, "265"), BPM267(111, "267"), BPM269(112, "269"), BPM271(
                        113, "271"), BPM273(114, "273"), BPM275(115, "275"), BPM277(
                        116, "277"), BPM280(117, "280"), BPM282(118, "282"), BPM284(
                        119, "284"), BPM286(120, "286"), BPM288(121, "288"), BPM290(
                        122, "290"), BPM292(123, "292"), BPM294(124, "294"), BPM296(
                        125, "296"), BPM298(126, "298"), BPM300(127, "300");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Tempos> map = new ReverseEnumMap<Tempos>(
                        Tempos.class);

        private Tempos(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Tempos convert(final int value) {
                return map.get(value);
        }
}
