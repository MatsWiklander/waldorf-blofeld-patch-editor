package main.java.com.futureoperations.waldorfblofeldpatcheditor.models.lfos;

import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.EnumConverter;
import main.java.com.futureoperations.waldorfblofeldpatcheditor.utils.ReverseEnumMap;

public enum FreeTo355Degree implements EnumConverter<FreeTo355Degree> {
        FREE(0, "free"), DEGREE3(1, "3"), DEGREE6(2, "6"), DEGREE8(3, "8"), DEGREE11(
                        4, "11"), DEGREE14(5, "14"), DEGREE17(6, "17"), DEGREE20(
                        7, "20"), DEGREE22(8, "22"), DEGREE25(9, "25"), DEGREE28(
                        10, "28"), DEGREE31(11, "31"), DEGREE34(12, "34"), DEGREE36(
                        13, "36"), DEGREE39(14, "39"), DEGREE42(15, "42"), DEGREE45(
                        16, "45"), DEGREE48(17, "48"), DEGREE50(18, "50"), DEGREE53(
                        19, "53"), DEGREE56(20, "56"), DEGREE59(21, "59"), DEGREE61(
                        22, "61"), DEGREE64(23, "64"), DEGREE67(24, "67"), DEGREE70(
                        25, "70"), DEGREE73(26, "73"), DEGREE75(27, "75"), DEGREE78(
                        28, "78"), DEGREE81(29, "81"), DEGREE84(30, "84"), DEGREE87(
                        31, "87"), DEGREE89(32, "89"), DEGREE92(33, "92"), DEGREE95(
                        34, "95"), DEGREE98(35, "98"), DEGREE101(36, "101"), DEGREE103(
                        37, "103"), DEGREE106(38, "106"), DEGREE109(39, "109"), DEGREE112(
                        40, "112"), DEGREE115(41, "115"), DEGREE117(42, "117"), DEGREE120(
                        43, "120"), DEGREE123(44, "123"), DEGREE126(45, "126"), DEGREE129(
                        46, "129"), DEGREE131(47, "131"), DEGREE134(48, "134"), DEGREE137(
                        49, "137"), DEGREE140(50, "140"), DEGREE143(51, "143"), DEGREE145(
                        52, "145"), DEGREE148(53, "148"), DEGREE151(54, "151"), DEGREE154(
                        55, "154"), DEGREE157(56, "157"), DEGREE159(57, "159"), DEGREE162(
                        58, "162"), DEGREE165(59, "165"), DEGREE168(60, "168"), DEGREE171(
                        61, "171"), DEGREE173(62, "173"), DEGREE176(63, "176"), DEGREE179(
                        64, "179"), DEGREE182(65, "182"), DEGREE184(66, "184"), DEGREE187(
                        67, "187"), DEGREE190(68, "190"), DEGREE193(69, "193"), DEGREE196(
                        70, "196"), DEGREE198(71, "198"), DEGREE201(72, "201"), DEGREE204(
                        73, "204"), DEGREE207(74, "207"), DEGREE210(75, "210"), DEGREE212(
                        76, "212"), DEGREE215(77, "215"), DEGREE218(78, "218"), DEGREE221(
                        79, "221"), DEGREE224(80, "224"), DEGREE226(81, "226"), DEGREE229(
                        82, "229"), DEGREE232(83, "232"), DEGREE235(84, "235"), DEGREE238(
                        85, "238"), DEGREE240(86, "240"), DEGREE243(87, "243"), DEGREE246(
                        88, "246"), DEGREE249(89, "249"), DEGREE252(90, "252"), DEGREE254(
                        91, "254"), DEGREE257(92, "257"), DEGREE260(93, "260"), DEGREE263(
                        94, "263"), DEGREE266(95, "266"), DEGREE268(96, "268"), DEGREE271(
                        97, "271"), DEGREE274(98, "274"), DEGREE277(99, "277"), DEGREE280(
                        100, "280"), DEGREE282(101, "282"), DEGREE285(102,
                        "285"), DEGREE288(103, "288"), DEGREE291(104, "291"), DEGREE294(
                        105, "294"), DEGREE296(106, "296"), DEGREE299(107,
                        "299"), DEGREE302(108, "302"), DEGREE305(109, "305"), DEGREE307(
                        110, "307"), DEGREE310(111, "310"), DEGREE313(112,
                        "313"), DEGREE316(113, "316"), DEGREE319(114, "319"), DEGREE321(
                        115, "321"), DEGREE324(116, "324"), DEGREE327(117,
                        "327"), DEGREE330(118, "330"), DEGREE333(119, "333"), DEGREE335(
                        120, "335"), DEGREE338(121, "338"), DEGREE341(122,
                        "341"), DEGREE344(123, "344"), DEGREE347(124, "347"), DEGREE349(
                        125, "349"), DEGREE352(126, "352"), DEGREE355(127,
                        "355");

        public final int value;

        public final String name;
        private static ReverseEnumMap<FreeTo355Degree> map = new ReverseEnumMap<FreeTo355Degree>(
                        FreeTo355Degree.class);

        private FreeTo355Degree(final int value, final String name) {
                this.value = value;
                this.name = name;
        }

        @Override
        public int convert() {
                return this.value;
        }

        @Override
        public FreeTo355Degree convert(final int value) {
                return map.get(value);
        }
}
