package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.enums;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum Minus200PercentToPlus196Percent implements
                EnumConverter<Minus200PercentToPlus196Percent> {
        MINUS200PERCENT(0, "-200%"), MINUS197PERCENT(1, "-197%"), MINUS194PERCENT(
                        2, "-194%"), MINUS191PERCENT(3, "-191%"), MINUS188PERCENT(
                        4, "-188%"), MINUS184PERCENT(5, "-184%"), MINUS181PERCENT(
                        6, "-181%"), MINUS178PERCENT(7, "-178%"), MINUS175PERCENT(
                        8, "-175%"), MINUS172PERCENT(9, "-172%"), MINUS169PERCENT(
                        10, "-169%"), MINUS166PERCENT(11, "-166%"), MINUS163PERCENT(
                        12, "-163%"), MINUS159PERCENT(13, "-159%"), MINUS156PERCENT(
                        14, "-156%"), MINUS153PERCENT(15, "-153%"), MINUS150PERCENT(
                        16, "-150%"), MINUS147PERCENT(17, "-147%"), MINUS144PERCENT(
                        18, "-144%"), MINUS141PERCENT(19, "-141%"), MINUS138PERCENT(
                        20, "-138%"), MINUS135PERCENT(21, "-135%"), MINUS131PERCENT(
                        22, "-131%"), MINUS128PERCENT(23, "-128%"), MINUS125PERCENT(
                        24, "-125%"), MINUS122PERCENT(25, "-122%"), MINUS119PERCENT(
                        26, "-119%"), MINUS116PERCENT(27, "-116%"), MINUS113PERCENT(
                        28, "-113%"), MINUS110PERCENT(29, "-110%"), MINUS106PERCENT(
                        30, "-106%"), MINUS103PERCENT(31, "-103%"), MINUS100PERCENT(
                        32, "-100%"), MINUS97PERCENT(33, "-97%"), MINUS94PERCENT(
                        34, "-94%"), MINUS91PERCENT(35, "-91%"), MINUS88PERCENT(
                        36, "-88%"), MINUS85PERCENT(37, "-85%"), MINUS82PERCENT(
                        38, "-82%"), MINUS78PERCENT(39, "-78%"), MINUS75PERCENT(
                        40, "-75%"), MINUS72PERCENT(41, "-72%"), MINUS69PERCENT(
                        42, "-69%"), MINUS66PERCENT(43, "-66%"), MINUS63PERCENT(
                        44, "-63%"), MINUS60PERCENT(45, "-60%"), MINUS57PERCENT(
                        46, "-57%"), MINUS53PERCENT(47, "-53%"), MINUS50PERCENT(
                        48, "-50%"), MINUS47PERCENT(49, "-47%"), MINUS44PERCENT(
                        50, "-44%"), MINUS41PERCENT(51, "-41%"), MINUS38PERCENT(
                        52, "-38%"), MINUS35PERCENT(53, "-35%"), MINUS32PERCENT(
                        54, "-32%"), MINUS29PERCENT(55, "-29%"), MINUS25PERCENT(
                        56, "-25%"), MINUS22PERCENT(57, "-22%"), MINUS19PERCENT(
                        58, "-19%"), MINUS16PERCENT(59, "-16%"), MINUS13PERCENT(
                        60, "-13%"), MINUS10PERCENT(61, "-10%"), MINUS7PERCENT(
                        62, "-7%"), MINUS4PERCENT(63, "-4%"), ZEROPERCENT(64,
                        "0%"), PLUS3PERCENT(65, "3%"), PLUS6PERCENT(66, "6%"), PLUS9PERCENT(
                        67, "9%"), PLUS12PERCENT(68, "12%"), PLUS15PERCENT(69,
                        "15%"), PLUS18PERCENT(70, "18%"), PLUS21PERCENT(71,
                        "21%"), PLUS25PERCENT(72, "25%"), PLUS28PERCENT(73,
                        "28%"), PLUS31PERCENT(74, "31%"), PLUS34PERCENT(75,
                        "34%"), PLUS37PERCENT(76, "37%"), PLUS40PERCENT(77,
                        "40%"), PLUS43PERCENT(78, "43%"), PLUS46PERCENT(79,
                        "46%"), PLUS49PERCENT(80, "49%"), PLUS53PERCENT(81,
                        "53%"), PLUS56PERCENT(82, "56%"), PLUS59PERCENT(83,
                        "59%"), PLUS62PERCENT(84, "62%"), PLUS65PERCENT(85,
                        "65%"), PLUS68PERCENT(86, "68%"), PLUS71PERCENT(87,
                        "71%"), PLUS74PERCENT(88, "74%"), PLUS78PERCENT(89,
                        "78%"), PLUS81PERCENT(90, "81%"), PLUS84PERCENT(91,
                        "84%"), PLUS87PERCENT(92, "87%"), PLUS90PERCENT(93,
                        "90%"), PLUS93PERCENT(94, "93%"), PLUS96PERCENT(95,
                        "96%"), PLUS99PERCENT(96, "99%"), PLUS102PERCENT(97,
                        "102%"), PLUS106PERCENT(98, "106%"), PLUS109PERCENT(99,
                        "109%"), PLUS112PERCENT(100, "112%"), PLUS115PERCENT(
                        101, "115%"), PLUS118PERCENT(102, "118%"), PLUS121PERCENT(
                        103, "121%"), PLUS124PERCENT(104, "124%"), PLUS127PERCENT(
                        105, "127%"), PLUS131PERCENT(106, "131%"), PLUS134PERCENT(
                        107, "134%"), PLUS137PERCENT(108, "137%"), PLUS140PERCENT(
                        109, "140%"), PLUS143PERCENT(110, "143%"), PLUS146PERCENT(
                        111, "146%"), PLUS149PERCENT(112, "149%"), PLUS152PERCENT(
                        113, "152%"), PLUS155PERCENT(114, "155%"), PLUS159PERCENT(
                        115, "159%"), PLUS162PERCENT(116, "162%"), PLUS165PERCENT(
                        117, "165%"), PLUS168PERCENT(118, "168%"), PLUS171PERCENT(
                        119, "171%"), PLUS174PERCENT(120, "174%"), PLUS177PERCENT(
                        121, "177%"), PLUS180PERCENT(122, "180%"), PLUS184PERCENT(
                        123, "184%"), PLUS187PERCENT(124, "187%"), PLUS190PERCENT(
                        125, "190%"), PLUS193PERCENT(126, "193%"), PLUS196PERCENT(
                        127, "196%");

        public final int value;

        public final String name;
        private static ReverseEnumMap<Minus200PercentToPlus196Percent> map = new ReverseEnumMap<Minus200PercentToPlus196Percent>(
                        Minus200PercentToPlus196Percent.class);

        private Minus200PercentToPlus196Percent(final int value,
                        final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public Minus200PercentToPlus196Percent convert(final int value) {
                return map.get(value);
        }
}
