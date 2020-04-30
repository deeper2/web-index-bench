package nudt.compression.partition;


/**
 * BytePacking routines for VSE 256
 * 
 * packing 
 * problems: check inpos, check 0xFF
 * 
 * @author Kun Jiang
 * 
 */
public final class BytePackingKBP {

	/**
	 * @param in
	 *            source array
	 * @param inpos
	 *            position in source array
	 * @param out
	 *            output array
	 * @param outpos
	 *            position in output array
	 * @param index
	 *            configuration index
	 */
	public static void fastpack(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos, final int index) {
		switch (index) {
		case 0://0 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack0(in, inpos, out, outpos);
			break;
		case 1:
			fastpack1(in, inpos, out, outpos);
			break;
		case 2:
			fastpack2(in, inpos, out, outpos);
			break;
		case 3:
			fastpack3(in, inpos, out, outpos);
			break;
		case 4:
			fastpack4(in, inpos, out, outpos);
			break;
		case 5:
			fastpack5(in, inpos, out, outpos);
			break;
		case 6:
			fastpack6(in, inpos, out, outpos);
			break;
		case 7:
			fastpack7(in, inpos, out, outpos);
			break;
		case 8:
			fastpack8(in, inpos, out, outpos);
			break;
		case 9:
			fastpack9(in, inpos, out, outpos);
			break;
		case 10:
			fastpack10(in, inpos, out, outpos);
			break;
		case 11:
			fastpack11(in, inpos, out, outpos);
			break;
		case 12:
			fastpack12(in, inpos, out, outpos);
			break;
		case 13:
			fastpack13(in, inpos, out, outpos);
			break;
		case 14:
			fastpack14(in, inpos, out, outpos);
			break;
		case 15:
			fastpack15(in, inpos, out, outpos);
			break;
		case 16://1 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack16(in, inpos, out, outpos);
			break;
		case 17:
			fastpack17(in, inpos, out, outpos);
			break;
		case 18:
			fastpack18(in, inpos, out, outpos);
			break;
		case 19:
			fastpack19(in, inpos, out, outpos);
			break;
		case 20:
			fastpack20(in, inpos, out, outpos);
			break;
		case 21:
			fastpack21(in, inpos, out, outpos);
			break;
		case 22:
			fastpack22(in, inpos, out, outpos);
			break;
		case 23:
			fastpack23(in, inpos, out, outpos);
			break;
		case 24:
			fastpack24(in, inpos, out, outpos);
			break;
		case 25:
			fastpack25(in, inpos, out, outpos);
			break;
		case 26:
			fastpack26(in, inpos, out, outpos);
			break;
		case 27:
			fastpack27(in, inpos, out, outpos);
			break;
		case 28:
			fastpack28(in, inpos, out, outpos);
			break;
		case 29:
			fastpack29(in, inpos, out, outpos);
			break;
		case 30:
			fastpack30(in, inpos, out, outpos);
			break;
		case 31:
			fastpack31(in, inpos, out, outpos);
			break;
		case 32://2 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack32(in, inpos, out, outpos);
			break;
		case 33:
			fastpack33(in, inpos, out, outpos);
			break;
		case 34:
			fastpack34(in, inpos, out, outpos);
			break;
		case 35:
			fastpack35(in, inpos, out, outpos);
			break;
		case 36:
			fastpack36(in, inpos, out, outpos);
			break;
		case 37:
			fastpack37(in, inpos, out, outpos);
			break;
		case 38:
			fastpack38(in, inpos, out, outpos);
			break;
		case 39:
			fastpack39(in, inpos, out, outpos);
			break;
		case 40:
			fastpack40(in, inpos, out, outpos);
			break;
		case 41:
			fastpack41(in, inpos, out, outpos);
			break;
		case 42:
			fastpack42(in, inpos, out, outpos);
			break;
		case 43:
			fastpack43(in, inpos, out, outpos);
			break;
		case 44:
			fastpack44(in, inpos, out, outpos);
			break;
		case 45:
			fastpack45(in, inpos, out, outpos);
			break;
		case 46:
			fastpack46(in, inpos, out, outpos);
			break;
		case 47:
			fastpack47(in, inpos, out, outpos);
			break;
		case 48://3 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack48(in, inpos, out, outpos);
			break;
		case 49:
			fastpack49(in, inpos, out, outpos);
			break;
		case 50:
			fastpack50(in, inpos, out, outpos);
			break;
		case 51:
			fastpack51(in, inpos, out, outpos);
			break;
		case 52:
			fastpack52(in, inpos, out, outpos);
			break;
		case 53:
			fastpack53(in, inpos, out, outpos);
			break;
		case 54:
			fastpack54(in, inpos, out, outpos);
			break;
		case 55:
			fastpack55(in, inpos, out, outpos);
			break;
		case 56:
			fastpack56(in, inpos, out, outpos);
			break;
		case 57:
			fastpack57(in, inpos, out, outpos);
			break;
		case 58:
			fastpack58(in, inpos, out, outpos);
			break;
		case 59:
			fastpack59(in, inpos, out, outpos);
			break;
		case 60:
			fastpack60(in, inpos, out, outpos);
			break;
		case 61:
			fastpack61(in, inpos, out, outpos);
			break;
		case 62:
			fastpack62(in, inpos, out, outpos);
			break;
		case 63:
			fastpack63(in, inpos, out, outpos);
			break;
		case 64://4 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack64(in, inpos, out, outpos);
			break;
		case 65:
			fastpack65(in, inpos, out, outpos);
			break;
		case 66:
			fastpack66(in, inpos, out, outpos);
			break;
		case 67:
			fastpack67(in, inpos, out, outpos);
			break;
		case 68:
			fastpack68(in, inpos, out, outpos);
			break;
		case 69:
			fastpack69(in, inpos, out, outpos);
			break;
		case 70:
			fastpack70(in, inpos, out, outpos);
			break;
		case 71:
			fastpack71(in, inpos, out, outpos);
			break;
		case 72:
			fastpack72(in, inpos, out, outpos);
			break;
		case 73:
			fastpack73(in, inpos, out, outpos);
			break;
		case 74:
			fastpack74(in, inpos, out, outpos);
			break;
		case 75:
			fastpack75(in, inpos, out, outpos);
			break;
		case 76:
			fastpack76(in, inpos, out, outpos);
			break;
		case 77:
			fastpack77(in, inpos, out, outpos);
			break;
		case 78:
			fastpack78(in, inpos, out, outpos);
			break;
		case 79:
			fastpack79(in, inpos, out, outpos);
			break;
		case 80://5 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack80(in, inpos, out, outpos);
			break;
		case 81:
			fastpack81(in, inpos, out, outpos);
			break;
		case 82:
			fastpack82(in, inpos, out, outpos);
			break;
		case 83:
			fastpack83(in, inpos, out, outpos);
			break;
		case 84:
			fastpack84(in, inpos, out, outpos);
			break;
		case 85:
			fastpack85(in, inpos, out, outpos);
			break;
		case 86:
			fastpack86(in, inpos, out, outpos);
			break;
		case 87:
			fastpack87(in, inpos, out, outpos);
			break;
		case 88:
			fastpack88(in, inpos, out, outpos);
			break;
		case 89:
			fastpack89(in, inpos, out, outpos);
			break;
		case 90:
			fastpack90(in, inpos, out, outpos);
			break;
		case 91:
			fastpack91(in, inpos, out, outpos);
			break;
		case 92:
			fastpack92(in, inpos, out, outpos);
			break;
		case 93:
			fastpack93(in, inpos, out, outpos);
			break;
		case 94:
			fastpack94(in, inpos, out, outpos);
			break;
		case 95:
			fastpack95(in, inpos, out, outpos);
			break;
		case 96://6 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack96(in, inpos, out, outpos);
			break;
		case 97:
			fastpack97(in, inpos, out, outpos);
			break;
		case 98:
			fastpack98(in, inpos, out, outpos);
			break;
		case 99:
			fastpack99(in, inpos, out, outpos);
			break;
		case 100:
			fastpack100(in, inpos, out, outpos);
			break;
		case 101:
			fastpack101(in, inpos, out, outpos);
			break;
		case 102:
			fastpack102(in, inpos, out, outpos);
			break;
		case 103:
			fastpack103(in, inpos, out, outpos);
			break;
		case 104:
			fastpack104(in, inpos, out, outpos);
			break;
		case 105:
			fastpack105(in, inpos, out, outpos);
			break;
		case 106:
			fastpack106(in, inpos, out, outpos);
			break;
		case 107:
			fastpack107(in, inpos, out, outpos);
			break;
		case 108:
			fastpack108(in, inpos, out, outpos);
			break;
		case 109:
			fastpack109(in, inpos, out, outpos);
			break;
		case 110:
			fastpack110(in, inpos, out, outpos);
			break;
		case 111:
			fastpack111(in, inpos, out, outpos);
			break;
		case 112://7 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack112(in, inpos, out, outpos);
			break;
		case 113:
			fastpack113(in, inpos, out, outpos);
			break;
		case 114:
			fastpack114(in, inpos, out, outpos);
			break;
		case 115:
			fastpack115(in, inpos, out, outpos);
			break;
		case 116:
			fastpack116(in, inpos, out, outpos);
			break;
		case 117:
			fastpack117(in, inpos, out, outpos);
			break;
		case 118:
			fastpack118(in, inpos, out, outpos);
			break;
		case 119:
			fastpack119(in, inpos, out, outpos);
			break;
		case 120:
			fastpack120(in, inpos, out, outpos);
			break;
		case 121:
			fastpack121(in, inpos, out, outpos);
			break;
		case 122:
			fastpack122(in, inpos, out, outpos);
			break;
		case 123:
			fastpack123(in, inpos, out, outpos);
			break;
		case 124:
			fastpack124(in, inpos, out, outpos);
			break;
		case 125:
			fastpack125(in, inpos, out, outpos);
			break;
		case 126:
			fastpack126(in, inpos, out, outpos);
			break;
		case 127:
			fastpack127(in, inpos, out, outpos);
			break;
		case 128://8 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack128(in, inpos, out, outpos);
			break;
		case 129:
			fastpack129(in, inpos, out, outpos);
			break;
		case 130:
			fastpack130(in, inpos, out, outpos);
			break;
		case 131:
			fastpack131(in, inpos, out, outpos);
			break;
		case 132:
			fastpack132(in, inpos, out, outpos);
			break;
		case 133:
			fastpack133(in, inpos, out, outpos);
			break;
		case 134:
			fastpack134(in, inpos, out, outpos);
			break;
		case 135:
			fastpack135(in, inpos, out, outpos);
			break;
		case 136:
			fastpack136(in, inpos, out, outpos);
			break;
		case 137:
			fastpack137(in, inpos, out, outpos);
			break;
		case 138:
			fastpack138(in, inpos, out, outpos);
			break;
		case 139:
			fastpack139(in, inpos, out, outpos);
			break;
		case 140:
			fastpack140(in, inpos, out, outpos);
			break;
		case 141:
			fastpack141(in, inpos, out, outpos);
			break;
		case 142:
			fastpack142(in, inpos, out, outpos);
			break;
		case 143:
			fastpack143(in, inpos, out, outpos);
			break;
		case 144://9 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack144(in, inpos, out, outpos);
			break;
		case 145:
			fastpack145(in, inpos, out, outpos);
			break;
		case 146:
			fastpack146(in, inpos, out, outpos);
			break;
		case 147:
			fastpack147(in, inpos, out, outpos);
			break;
		case 148:
			fastpack148(in, inpos, out, outpos);
			break;
		case 149:
			fastpack149(in, inpos, out, outpos);
			break;
		case 150:
			fastpack150(in, inpos, out, outpos);
			break;
		case 151:
			fastpack151(in, inpos, out, outpos);
			break;
		case 152:
			fastpack152(in, inpos, out, outpos);
			break;
		case 153:
			fastpack153(in, inpos, out, outpos);
			break;
		case 154:
			fastpack154(in, inpos, out, outpos);
			break;
		case 155:
			fastpack155(in, inpos, out, outpos);
			break;
		case 156:
			fastpack156(in, inpos, out, outpos);
			break;
		case 157:
			fastpack157(in, inpos, out, outpos);
			break;
		case 158:
			fastpack158(in, inpos, out, outpos);
			break;
		case 159:
			fastpack159(in, inpos, out, outpos);
			break;
		case 160://10 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack160(in, inpos, out, outpos);
			break;
		case 161:
			fastpack161(in, inpos, out, outpos);
			break;
		case 162:
			fastpack162(in, inpos, out, outpos);
			break;
		case 163:
			fastpack163(in, inpos, out, outpos);
			break;
		case 164:
			fastpack164(in, inpos, out, outpos);
			break;
		case 165:
			fastpack165(in, inpos, out, outpos);
			break;
		case 166:
			fastpack166(in, inpos, out, outpos);
			break;
		case 167:
			fastpack167(in, inpos, out, outpos);
			break;
		case 168:
			fastpack168(in, inpos, out, outpos);
			break;
		case 169:
			fastpack169(in, inpos, out, outpos);
			break;
		case 170:
			fastpack170(in, inpos, out, outpos);
			break;
		case 171:
			fastpack171(in, inpos, out, outpos);
			break;
		case 172:
			fastpack172(in, inpos, out, outpos);
			break;
		case 173:
			fastpack173(in, inpos, out, outpos);
			break;
		case 174:
			fastpack174(in, inpos, out, outpos);
			break;
		case 175:
			fastpack175(in, inpos, out, outpos);
			break;
		case 176://11 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack176(in, inpos, out, outpos);
			break;
		case 177:
			fastpack177(in, inpos, out, outpos);
			break;
		case 178:
			fastpack178(in, inpos, out, outpos);
			break;
		case 179:
			fastpack179(in, inpos, out, outpos);
			break;
		case 180:
			fastpack180(in, inpos, out, outpos);
			break;
		case 181:
			fastpack181(in, inpos, out, outpos);
			break;
		case 182:
			fastpack182(in, inpos, out, outpos);
			break;
		case 183:
			fastpack183(in, inpos, out, outpos);
			break;
		case 184:
			fastpack184(in, inpos, out, outpos);
			break;
		case 185:
			fastpack185(in, inpos, out, outpos);
			break;
		case 186:
			fastpack186(in, inpos, out, outpos);
			break;
		case 187:
			fastpack187(in, inpos, out, outpos);
			break;
		case 188:
			fastpack188(in, inpos, out, outpos);
			break;
		case 189:
			fastpack189(in, inpos, out, outpos);
			break;
		case 190:
			fastpack190(in, inpos, out, outpos);
			break;
		case 191:
			fastpack191(in, inpos, out, outpos);
			break;
		case 192://12 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack192(in, inpos, out, outpos);
			break;
		case 193:
			fastpack193(in, inpos, out, outpos);
			break;
		case 194:
			fastpack194(in, inpos, out, outpos);
			break;
		case 195:
			fastpack195(in, inpos, out, outpos);
			break;
		case 196:
			fastpack196(in, inpos, out, outpos);
			break;
		case 197:
			fastpack197(in, inpos, out, outpos);
			break;
		case 198:
			fastpack198(in, inpos, out, outpos);
			break;
		case 199:
			fastpack199(in, inpos, out, outpos);
			break;
		case 200:
			fastpack200(in, inpos, out, outpos);
			break;
		case 201:
			fastpack201(in, inpos, out, outpos);
			break;
		case 202:
			fastpack202(in, inpos, out, outpos);
			break;
		case 203:
			fastpack203(in, inpos, out, outpos);
			break;
		case 204:
			fastpack204(in, inpos, out, outpos);
			break;
		case 205:
			fastpack205(in, inpos, out, outpos);
			break;
		case 206:
			fastpack206(in, inpos, out, outpos);
			break;
		case 207:
			fastpack207(in, inpos, out, outpos);
			break;
		case 208://16 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack208(in, inpos, out, outpos);
			break;
		case 209:
			fastpack209(in, inpos, out, outpos);
			break;
		case 210:
			fastpack210(in, inpos, out, outpos);
			break;
		case 211:
			fastpack211(in, inpos, out, outpos);
			break;
		case 212:
			fastpack212(in, inpos, out, outpos);
			break;
		case 213:
			fastpack213(in, inpos, out, outpos);
			break;
		case 214:
			fastpack214(in, inpos, out, outpos);
			break;
		case 215:
			fastpack215(in, inpos, out, outpos);
			break;
		case 216:
			fastpack216(in, inpos, out, outpos);
			break;
		case 217:
			fastpack217(in, inpos, out, outpos);
			break;
		case 218:
			fastpack218(in, inpos, out, outpos);
			break;
		case 219:
			fastpack219(in, inpos, out, outpos);
			break;
		case 220:
			fastpack220(in, inpos, out, outpos);
			break;
		case 221:
			fastpack221(in, inpos, out, outpos);
			break;
		case 222:
			fastpack222(in, inpos, out, outpos);
			break;
		case 223:
			fastpack223(in, inpos, out, outpos);
			break;
		case 224://20 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack224(in, inpos, out, outpos);
			break;
		case 225:
			fastpack225(in, inpos, out, outpos);
			break;
		case 226:
			fastpack226(in, inpos, out, outpos);
			break;
		case 227:
			fastpack227(in, inpos, out, outpos);
			break;
		case 228:
			fastpack228(in, inpos, out, outpos);
			break;
		case 229:
			fastpack229(in, inpos, out, outpos);
			break;
		case 230:
			fastpack230(in, inpos, out, outpos);
			break;
		case 231:
			fastpack231(in, inpos, out, outpos);
			break;
		case 232:
			fastpack232(in, inpos, out, outpos);
			break;
		case 233:
			fastpack233(in, inpos, out, outpos);
			break;
		case 234:
			fastpack234(in, inpos, out, outpos);
			break;
		case 235:
			fastpack235(in, inpos, out, outpos);
			break;
		case 236:
			fastpack236(in, inpos, out, outpos);
			break;
		case 237:
			fastpack237(in, inpos, out, outpos);
			break;
		case 238:
			fastpack238(in, inpos, out, outpos);
			break;
		case 239:
			fastpack239(in, inpos, out, outpos);
			break;
		case 240://32 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastpack240(in, inpos, out, outpos);
			break;
		case 241:
			fastpack241(in, inpos, out, outpos);
			break;
		case 242:
			fastpack242(in, inpos, out, outpos);
			break;
		case 243:
			fastpack243(in, inpos, out, outpos);
			break;
		case 244:
			fastpack244(in, inpos, out, outpos);
			break;
		case 245:
			fastpack245(in, inpos, out, outpos);
			break;
		case 246:
			fastpack246(in, inpos, out, outpos);
			break;
		case 247:
			fastpack247(in, inpos, out, outpos);
			break;
		case 248:
			fastpack248(in, inpos, out, outpos);
			break;
		case 249:
			fastpack249(in, inpos, out, outpos);
			break;
		case 250:
			fastpack250(in, inpos, out, outpos);
			break;
		case 251:
			fastpack251(in, inpos, out, outpos);
			break;
		case 252:
			fastpack252(in, inpos, out, outpos);
			break;
		case 253:
			fastpack253(in, inpos, out, outpos);
			break;
		case 254:
			fastpack254(in, inpos, out, outpos);
			break;
		case 255:
			fastpack255(in, inpos, out, outpos);
			break;
		default:
		{
			throw new IllegalArgumentException("Unsupported bit width.");
		}
		}
	}

	//1 0bit
	protected static void fastpack0(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(1);
		outpos.add(0);//add one extra 1 if there is a flag number stored before frame
	}
	//2 0bit
	protected static void fastpack1(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(2);
		outpos.add(0);
	}
	//3 0bit
	protected static void fastpack2(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(3);
		outpos.add(0);
	}
	//4 0bit
	protected static void fastpack3(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(4);
		outpos.add(0);
	}
	//5 0bit
	protected static void fastpack4(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(5);
		outpos.add(0);
	}
	//6 0bit
	protected static void fastpack5(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(6);
		outpos.add(0);
	}
	//7 0bit
	protected static void fastpack6(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(7);
		outpos.add(0);
	}
	//8 0bit
	protected static void fastpack7(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(8);
		outpos.add(0);
	}
	//9 0bit
	protected static void fastpack8(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(9);
		outpos.add(0);
	}
	//10 0bit
	protected static void fastpack9(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(10);
		outpos.add(0);
	}
	//11 0bit
	protected static void fastpack10(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(11);
		outpos.add(0);
	}
	//12 0bit
	protected static void fastpack11(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(12);
		outpos.add(0);
	}
	//14 0bit
	protected static void fastpack12(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(14);
		outpos.add(0);
	}
	//16 0bit
	protected static void fastpack13(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(16);
		outpos.add(0);
	}
	//32 0bit
	protected static void fastpack14(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(32);
		outpos.add(0);
	}
	//64 0bit
	protected static void fastpack15(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		inpos.add(64);
		outpos.add(0);
	}
	//1 1bit
	protected static void fastpack16(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {      
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

		final int intValues0 = in[offset + 0];

		out[outputOffset + 0] = (byte) ((intValues0 & 1) << 7);//&0xFF?

		inpos.add(1);
		outpos.add(1);
	}
	//2 1bit
	protected static void fastpack17(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {	      
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

		out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7) | ((intValues1 & 1) << 6));
		inpos.add(2);
		outpos.add(1);
	}
	//3 1bit
	protected static void fastpack18(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
	      final int outputOffset = outpos.get();
	      final int offset = inpos.get();
	      
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
	                                                | ((intValues1 & 1) << 6)
	                                                | ((intValues2 & 1) << 5));
	                                       
				
		inpos.add(3);
		outpos.add(1);
	}
	//4 1bit
	protected static void fastpack19(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
	      final int outputOffset = outpos.get();
	      final int offset = inpos.get();
	      
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
	                                                | ((intValues1 & 1) << 6)
	                                                | ((intValues2 & 1) << 5)
	                                                | ((intValues3 & 1) << 4));
				
		inpos.add(4);
		outpos.add(1);
	}
	//5 1bit
	protected static void fastpack20(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3));
		inpos.add(5);
		outpos.add(1);
	}

	//6 1bit
	protected static void fastpack21(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      
	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2));
		inpos.add(6);
		outpos.add(1);
	}

	//7 1bit
	protected static void fastpack22(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1));
		inpos.add(7);
		outpos.add(1);
	}

	//8 1bit
	protected static void fastpack23(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
		inpos.add(8);
		outpos.add(1);
	}

	//9 1bit
	protected static void fastpack24(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7));
		inpos.add(9);
		outpos.add(2);
	}

	//10 1bit
	protected static void fastpack25(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6));
		inpos.add(10);
		outpos.add(2);
	}

	//11 1bit
	protected static void fastpack26(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6)
                  | ((intValues10 & 1) << 5));
		inpos.add(11);
		outpos.add(2);
	}

	//12 1bit
	protected static void fastpack27(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6)
                  | ((intValues10 & 1) << 5)
                  | ((intValues11 & 1) << 4));
		inpos.add(12);
		outpos.add(2);
	}
	
	//14 1bit
	protected static void fastpack28(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6)
                  | ((intValues10 & 1) << 5)
                  | ((intValues11 & 1) << 4)
                  | ((intValues12 & 1) << 3)
                  | ((intValues13 & 1) << 2));
		inpos.add(14);
		outpos.add(2);
	}

	//16 1bit
	protected static void fastpack29(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6)
                  | ((intValues10 & 1) << 5)
                  | ((intValues11 & 1) << 4)
                  | ((intValues12 & 1) << 3)
                  | ((intValues13 & 1) << 2)
                  | ((intValues14 & 1) << 1)
                  | (intValues15 & 1));
		inpos.add(16);
		outpos.add(2);
	}

	//32 1bit
	protected static void fastpack30(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6)
                  | ((intValues10 & 1) << 5)
                  | ((intValues11 & 1) << 4)
                  | ((intValues12 & 1) << 3)
                  | ((intValues13 & 1) << 2)
                  | ((intValues14 & 1) << 1)
                  | (intValues15 & 1));
	      out[outputOffset + 2] = (byte) (((intValues16 & 1) << 7)
                  | ((intValues17 & 1) << 6)
                  | ((intValues18 & 1) << 5)
                  | ((intValues19 & 1) << 4)
                  | ((intValues20 & 1) << 3)
                  | ((intValues21 & 1) << 2)
                  | ((intValues22 & 1) << 1)
                  | (intValues23 & 1));
	      out[outputOffset + 3] = (byte) (((intValues24 & 1) << 7)
                  | ((intValues25 & 1) << 6)
                  | ((intValues26 & 1) << 5)
                  | ((intValues27 & 1) << 4)
                  | ((intValues28 & 1) << 3)
                  | ((intValues29 & 1) << 2)
                  | ((intValues30 & 1) << 1)
                  | (intValues31 & 1));
		inpos.add(32);
		outpos.add(4);
	}

	//64 1bit
	protected static void fastpack31(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 1) << 7)
                  | ((intValues1 & 1) << 6)
                  | ((intValues2 & 1) << 5)
                  | ((intValues3 & 1) << 4)
                  | ((intValues4 & 1) << 3)
                  | ((intValues5 & 1) << 2)
                  | ((intValues6 & 1) << 1)
                  | (intValues7 & 1));
	      out[outputOffset + 1] = (byte) (((intValues8 & 1) << 7)
                  | ((intValues9 & 1) << 6)
                  | ((intValues10 & 1) << 5)
                  | ((intValues11 & 1) << 4)
                  | ((intValues12 & 1) << 3)
                  | ((intValues13 & 1) << 2)
                  | ((intValues14 & 1) << 1)
                  | (intValues15 & 1));
	      out[outputOffset + 2] = (byte) (((intValues16 & 1) << 7)
                  | ((intValues17 & 1) << 6)
                  | ((intValues18 & 1) << 5)
                  | ((intValues19 & 1) << 4)
                  | ((intValues20 & 1) << 3)
                  | ((intValues21 & 1) << 2)
                  | ((intValues22 & 1) << 1)
                  | (intValues23 & 1));
	      out[outputOffset + 3] = (byte) (((intValues24 & 1) << 7)
                  | ((intValues25 & 1) << 6)
                  | ((intValues26 & 1) << 5)
                  | ((intValues27 & 1) << 4)
                  | ((intValues28 & 1) << 3)
                  | ((intValues29 & 1) << 2)
                  | ((intValues30 & 1) << 1)
                  | (intValues31 & 1));
	      out[outputOffset + 4] = (byte) (((intValues32 & 1) << 7)
                  | ((intValues33 & 1) << 6)
                  | ((intValues34 & 1) << 5)
                  | ((intValues35 & 1) << 4)
                  | ((intValues36 & 1) << 3)
                  | ((intValues37 & 1) << 2)
                  | ((intValues38 & 1) << 1)
                  | (intValues39 & 1));
	      out[outputOffset + 5] = (byte) (((intValues40 & 1) << 7)
                  | ((intValues41 & 1) << 6)
                  | ((intValues42 & 1) << 5)
                  | ((intValues43 & 1) << 4)
                  | ((intValues44 & 1) << 3)
                  | ((intValues45 & 1) << 2)
                  | ((intValues46 & 1) << 1)
                  | (intValues47 & 1));
	      out[outputOffset + 6] = (byte) (((intValues48 & 1) << 7)
                  | ((intValues49 & 1) << 6)
                  | ((intValues50 & 1) << 5)
                  | ((intValues51 & 1) << 4)
                  | ((intValues52 & 1) << 3)
                  | ((intValues53 & 1) << 2)
                  | ((intValues54 & 1) << 1)
                  | (intValues55 & 1));
	      out[outputOffset + 7] = (byte) (((intValues56 & 1) << 7)
                  | ((intValues57 & 1) << 6)
                  | ((intValues58 & 1) << 5)
                  | ((intValues59 & 1) << 4)
                  | ((intValues60 & 1) << 3)
                  | ((intValues61 & 1) << 2)
                  | ((intValues62 & 1) << 1)
                  | (intValues63 & 1));
		inpos.add(64);
		outpos.add(8);
	}

	//1 2bits
	protected static void fastpack32(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6));
		inpos.add(1);
		outpos.add(1);
	}

	//2 2bits
	protected static void fastpack33(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4));
		inpos.add(2);
		outpos.add(1);
	}

	//3 2bits
	protected static void fastpack34(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];
	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2));
		inpos.add(3);
		outpos.add(1);
	}

	//4 2bits
	protected static void fastpack35(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
		inpos.add(4);
		outpos.add(1);
	}

	//5 2bits
	protected static void fastpack36(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];
	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6));
		inpos.add(5);
		outpos.add(2);
	}

	//6 2bits
	protected static void fastpack37(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4));
		inpos.add(6);
		outpos.add(2);
	}

	//7 2bits
	protected static void fastpack38(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];
	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2));
		inpos.add(7);
		outpos.add(2);
	}

	//8 2bits
	protected static void fastpack39(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
		inpos.add(8);
		outpos.add(2);
	}

	//9 2bits
	protected static void fastpack40(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6));
		inpos.add(9);
		outpos.add(3);
	}

	//10 2bits
	protected static void fastpack41(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4));
		inpos.add(10);
		outpos.add(3);
	}

	//11 2bits
	protected static void fastpack42(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4)
                  | ((intValues10 & 3) << 2));
		inpos.add(11);
		outpos.add(3);
	}

	//12 2bits
	protected static void fastpack43(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4)
                  | ((intValues10 & 3) << 2)
                  | (intValues11 & 3));
		inpos.add(12);
		outpos.add(3);
	}

	//14 2bits
	protected static void fastpack44(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4)
                  | ((intValues10 & 3) << 2)
                  | (intValues11 & 3));
	      out[outputOffset + 3] = (byte) (((intValues12 & 3) << 6)
                  | ((intValues13 & 3) << 4));
		inpos.add(14);
		outpos.add(4);
	}

	//16 2bits
	protected static void fastpack45(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4)
                  | ((intValues10 & 3) << 2)
                  | (intValues11 & 3));
	      out[outputOffset + 3] = (byte) (((intValues12 & 3) << 6)
                  | ((intValues13 & 3) << 4)
                  | ((intValues14 & 3) << 2)
                  | (intValues15 & 3));
		inpos.add(16);
		outpos.add(4);
	}

	//32 2bits
	protected static void fastpack46(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4)
                  | ((intValues10 & 3) << 2)
                  | (intValues11 & 3));
	      out[outputOffset + 3] = (byte) (((intValues12 & 3) << 6)
                  | ((intValues13 & 3) << 4)
                  | ((intValues14 & 3) << 2)
                  | (intValues15 & 3));
	      out[outputOffset + 4] = (byte) (((intValues16 & 3) << 6)
                  | ((intValues17 & 3) << 4)
                  | ((intValues18 & 3) << 2)
                  | (intValues19 & 3));
	      out[outputOffset + 5] = (byte) (((intValues20 & 3) << 6)
                  | ((intValues21 & 3) << 4)
                  | ((intValues22 & 3) << 2)
                  | (intValues23 & 3));
	      out[outputOffset + 6] = (byte) (((intValues24 & 3) << 6)
                  | ((intValues25 & 3) << 4)
                  | ((intValues26 & 3) << 2)
                  | (intValues27 & 3));
	      out[outputOffset + 7] = (byte) (((intValues28 & 3) << 6)
                  | ((intValues29 & 3) << 4)
                  | ((intValues30 & 3) << 2)
                  | (intValues31 & 3));
		inpos.add(32);
		outpos.add(8);
	}
	
	//64 2bits
	protected static void fastpack47(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 3) << 6)
                  | ((intValues1 & 3) << 4)
                  | ((intValues2 & 3) << 2)
                  | (intValues3 & 3));
	      out[outputOffset + 1] = (byte) (((intValues4 & 3) << 6)
                  | ((intValues5 & 3) << 4)
                  | ((intValues6 & 3) << 2)
                  | (intValues7 & 3));
	      out[outputOffset + 2] = (byte) (((intValues8 & 3) << 6)
                  | ((intValues9 & 3) << 4)
                  | ((intValues10 & 3) << 2)
                  | (intValues11 & 3));
	      out[outputOffset + 3] = (byte) (((intValues12 & 3) << 6)
                  | ((intValues13 & 3) << 4)
                  | ((intValues14 & 3) << 2)
                  | (intValues15 & 3));
	      out[outputOffset + 4] = (byte) (((intValues16 & 3) << 6)
                  | ((intValues17 & 3) << 4)
                  | ((intValues18 & 3) << 2)
                  | (intValues19 & 3));
	      out[outputOffset + 5] = (byte) (((intValues20 & 3) << 6)
                  | ((intValues21 & 3) << 4)
                  | ((intValues22 & 3) << 2)
                  | (intValues23 & 3));
	      out[outputOffset + 6] = (byte) (((intValues24 & 3) << 6)
                  | ((intValues25 & 3) << 4)
                  | ((intValues26 & 3) << 2)
                  | (intValues27 & 3));
	      out[outputOffset + 7] = (byte) (((intValues28 & 3) << 6)
                  | ((intValues29 & 3) << 4)
                  | ((intValues30 & 3) << 2)
                  | (intValues31 & 3));
	      out[outputOffset + 8] = (byte) (((intValues32 & 3) << 6)
                  | ((intValues33 & 3) << 4)
                  | ((intValues34 & 3) << 2)
                  | (intValues35 & 3));
	      out[outputOffset + 9] = (byte) (((intValues36 & 3) << 6)
                  | ((intValues37 & 3) << 4)
                  | ((intValues38 & 3) << 2)
                  | (intValues39 & 3));
	      out[outputOffset + 10] = (byte) (((intValues40 & 3) << 6)
                  | ((intValues41 & 3) << 4)
                  | ((intValues42 & 3) << 2)
                  | (intValues43 & 3));
	      out[outputOffset + 11] = (byte) (((intValues44 & 3) << 6)
                  | ((intValues45 & 3) << 4)
                  | ((intValues46 & 3) << 2)
                  | (intValues47 & 3));
	      out[outputOffset + 12] = (byte) (((intValues48 & 3) << 6)
                  | ((intValues49 & 3) << 4)
                  | ((intValues50 & 3) << 2)
                  | (intValues51 & 3));
	      out[outputOffset + 13] = (byte) (((intValues52 & 3) << 6)
                  | ((intValues53 & 3) << 4)
                  | ((intValues54 & 3) << 2)
                  | (intValues55 & 3));
	      out[outputOffset + 14] = (byte) (((intValues56 & 3) << 6)
                  | ((intValues57 & 3) << 4)
                  | ((intValues58 & 3) << 2)
                  | (intValues59 & 3));
	      out[outputOffset + 15] = (byte) (((intValues60 & 3) << 6)
                  | ((intValues61 & 3) << 4)
                  | ((intValues62 & 3) << 2)
                  | (intValues63 & 3));
		inpos.add(64);
		outpos.add(16);
	}
	
	//1 3bits
	protected static void fastpack48(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0];
	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5));
		inpos.add(1);
		outpos.add(1);
	}
	
	//2 3bits
	protected static void fastpack49(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2));
	      
		inpos.add(2);
		outpos.add(1);
	}
	
	//3 3bits
	protected static void fastpack50(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];
	      
	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7));

		inpos.add(3);
		outpos.add(2);
	}
	
	//4 3bits
	protected static void fastpack51(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      
	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4));

		inpos.add(4);
		outpos.add(2);
	}
	
	//5 3bits
	protected static void fastpack52(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1));

		inpos.add(5);
		outpos.add(2);
	}
	
	//6 3bits
	protected static void fastpack53(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      
	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6));
	      
		inpos.add(6);
		outpos.add(3);
	}
	
	//7 3bits
	protected static void fastpack54(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3));
	      
		inpos.add(7);
		outpos.add(3);
	}
	
	//8 3bits
	protected static void fastpack55(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      
		inpos.add(8);
		outpos.add(3);
	}
	
	//9 3bits
	protected static void fastpack56(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5));

		inpos.add(9);
		outpos.add(4);
	}
	
	//10 3bits
	protected static void fastpack57(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
		out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
		out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
		out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2));
	      
		inpos.add(10);
		outpos.add(4);
	}
	
	// 11 3bits
	protected static void fastpack58(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2)
                  | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7));
	      
		inpos.add(11);
		outpos.add(5);
	}
	
	//12 3bits
	protected static void fastpack59(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2)
                  | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
                  | ((intValues11 & 7) << 4));
	      
		inpos.add(12);
		outpos.add(5);
	}
	
	//14 3 bits
	protected static void fastpack60(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2)
                  | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
                  | ((intValues11 & 7) << 4)
                  | ((intValues12 & 7) << 1)
                  | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues13 & 3) << 6));
	      
		inpos.add(14);
		outpos.add(6);
	}
	
	//16 3bits
	protected static void fastpack61(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();

	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2)
                  | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
                  | ((intValues11 & 7) << 4)
                  | ((intValues12 & 7) << 1)
                  | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues13 & 3) << 6)
                  | ((intValues14 & 7) << 3)
                  | (intValues15 & 7));
		inpos.add(16);
		outpos.add(6);
	}
	
	//32 3bits
	protected static void fastpack62(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                  | ((intValues1 & 7) << 2)
                  | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                  | ((intValues3 & 7) << 4)
                  | ((intValues4 & 7) << 1)
                  | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                  | ((intValues6 & 7) << 3)
                  | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                  | ((intValues9 & 7) << 2)
                  | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
                  | ((intValues11 & 7) << 4)
                  | ((intValues12 & 7) << 1)
                  | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues13 & 3) << 6)
                  | ((intValues14 & 7) << 3)
                  | (intValues15 & 7));
	      out[outputOffset + 6] = (byte) (((intValues16 & 7) << 5)
                  | ((intValues17 & 7) << 2)
                  | ((intValues18 >>> 1) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues18 & 1) << 7)
                  | ((intValues19 & 7) << 4)
                  | ((intValues20 & 7) << 1)
                  | ((intValues21 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues21 & 3) << 6)
                  | ((intValues22 & 7) << 3)
                  | (intValues23 & 7));
	      out[outputOffset + 9] = (byte) (((intValues24 & 7) << 5)
                  | ((intValues25 & 7) << 2)
                  | ((intValues26 >>> 1) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues26 & 1) << 7)
                  | ((intValues27 & 7) << 4)
                  | ((intValues28 & 7) << 1)
                  | ((intValues29 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues29 & 3) << 6)
                  | ((intValues30 & 7) << 3)
                  | (intValues31 & 7));
	      
		inpos.add(32);
		outpos.add(12);
	}
	
	//64 3bits
	protected static void fastpack63(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 7) << 5)
                | ((intValues1 & 7) << 2)
                | ((intValues2 >>> 1) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues2 & 1) << 7)
                | ((intValues3 & 7) << 4)
                | ((intValues4 & 7) << 1)
                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues5 & 3) << 6)
                | ((intValues6 & 7) << 3)
                | (intValues7 & 7));
	      out[outputOffset + 3] = (byte) (((intValues8 & 7) << 5)
                | ((intValues9 & 7) << 2)
                | ((intValues10 >>> 1) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues10 & 1) << 7)
                | ((intValues11 & 7) << 4)
                | ((intValues12 & 7) << 1)
                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues13 & 3) << 6)
                | ((intValues14 & 7) << 3)
                | (intValues15 & 7));
	      out[outputOffset + 6] = (byte) (((intValues16 & 7) << 5)
                | ((intValues17 & 7) << 2)
                | ((intValues18 >>> 1) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues18 & 1) << 7)
                | ((intValues19 & 7) << 4)
                | ((intValues20 & 7) << 1)
                | ((intValues21 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues21 & 3) << 6)
                | ((intValues22 & 7) << 3)
                | (intValues23 & 7));
	      out[outputOffset + 9] = (byte) (((intValues24 & 7) << 5)
                | ((intValues25 & 7) << 2)
                | ((intValues26 >>> 1) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues26 & 1) << 7)
                | ((intValues27 & 7) << 4)
                | ((intValues28 & 7) << 1)
                | ((intValues29 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues29 & 3) << 6)
                | ((intValues30 & 7) << 3)
                | (intValues31 & 7));
	      out[outputOffset + 12] = (byte) (((intValues32 & 7) << 5)
	                | ((intValues33 & 7) << 2)
	                | ((intValues34 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues34 & 1) << 7)
                | ((intValues35 & 7) << 4)
                | ((intValues36 & 7) << 1)
                | ((intValues37 >>> 2) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues37 & 3) << 6)
                | ((intValues38 & 7) << 3)
                | (intValues39 & 7));
	      out[outputOffset + 15] = (byte) (((intValues40 & 7) << 5)
                | ((intValues41 & 7) << 2)
                | ((intValues42 >>> 1) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues42 & 1) << 7)
                | ((intValues43 & 7) << 4)
                | ((intValues44 & 7) << 1)
                | ((intValues45 >>> 2) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues45 & 3) << 6)
                | ((intValues46 & 7) << 3)
                | (intValues47 & 7));
	      out[outputOffset + 18] = (byte) (((intValues48 & 7) << 5)
                | ((intValues49 & 7) << 2)
                | ((intValues50 >>> 1) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues50 & 1) << 7)
                | ((intValues51 & 7) << 4)
                | ((intValues52 & 7) << 1)
                | ((intValues53 >>> 2) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues53 & 3) << 6)
                | ((intValues54 & 7) << 3)
                | (intValues55 & 7));
	      out[outputOffset + 21] = (byte) (((intValues56 & 7) << 5)
                | ((intValues57 & 7) << 2)
                | ((intValues58 >>> 1) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues58 & 1) << 7)
                | ((intValues59 & 7) << 4)
                | ((intValues60 & 7) << 1)
                | ((intValues61 >>> 2) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues61 & 3) << 6)
                | ((intValues62 & 7) << 3)
                | (intValues63 & 7));	      
	      
		inpos.add(64);
		outpos.add(24);
	}
	
	//1 4bits
	protected static void fastpack64(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4));
		inpos.add(1);
		outpos.add(1);
	}
	
	//2 4bits
	protected static void fastpack65(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
		inpos.add(2);
		outpos.add(1);
	}
	
	//3 4bits
	protected static void fastpack66(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4));
		inpos.add(3);
		outpos.add(2);
	}
	
	//4 4bits
	protected static void fastpack67(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
		inpos.add(4);
		outpos.add(2);
	}
	
	//5 4bits
	protected static void fastpack68(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4));
		inpos.add(5);
		outpos.add(3);
	}
	
	//6 4bits
	protected static void fastpack69(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
		inpos.add(6);
		outpos.add(3);
	}
	
	//7 4bits
	protected static void fastpack70(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4));
		inpos.add(7);
		outpos.add(4);
	}
	
	//8 4bits
	protected static void fastpack71(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                  | (intValues7 & 15));
		inpos.add(8);
		outpos.add(4);
	}
	
	//9 4bits
	protected static void fastpack72(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                  | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4));
		inpos.add(9);
		outpos.add(5);
	}
	
	//10 4bits
	protected static void fastpack73(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                  | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
                  | (intValues9 & 15));
		inpos.add(10);
		outpos.add(5);
	}
	
	//11 4bits
	protected static void fastpack74(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                  | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
                  | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4));
		inpos.add(11);
		outpos.add(6);
	}
	
	//12 4bits
	protected static void fastpack75(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                  | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
                  | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
                  | (intValues11 & 15));
		inpos.add(12);
		outpos.add(6);
	}
	
	//14 4bits
	protected static void fastpack76(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
                | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
                | (intValues11 & 15));
	      out[outputOffset + 6] = (byte) (((intValues12 & 15) << 4)
                | (intValues13 & 15));
		inpos.add(14);
		outpos.add(7);
	}
	
	//16 4bits
	protected static void fastpack77(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      
	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
                  | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
                  | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
                  | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
                  | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
                  | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
                  | (intValues11 & 15));
	      out[outputOffset + 6] = (byte) (((intValues12 & 15) << 4)
                  | (intValues13 & 15));
	      out[outputOffset + 7] = (byte) (((intValues14 & 15) << 4)
                  | (intValues15 & 15));
		inpos.add(16);
		outpos.add(8);
	}
	
	//32 4bits
	protected static void fastpack78(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
	                                                | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
	                                                | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
	                                                | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
	                                                | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
	                                                | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
	                                                | (intValues11 & 15));
	      out[outputOffset + 6] = (byte) (((intValues12 & 15) << 4)
	                                                | (intValues13 & 15));
	      out[outputOffset + 7] = (byte) (((intValues14 & 15) << 4)
	                                                | (intValues15 & 15));
	      out[outputOffset + 8] = (byte) (((intValues16 & 15) << 4)
	                                                | (intValues17 & 15));
	      out[outputOffset + 9] = (byte) (((intValues18 & 15) << 4)
	                                                | (intValues19 & 15));
	      out[outputOffset + 10] = (byte) (((intValues20 & 15) << 4)
	                                                | (intValues21 & 15));
	      out[outputOffset + 11] = (byte) (((intValues22 & 15) << 4)
	                                                | (intValues23 & 15));
	      out[outputOffset + 12] = (byte) (((intValues24 & 15) << 4)
	                                                | (intValues25 & 15));
	      out[outputOffset + 13] = (byte) (((intValues26 & 15) << 4)
	                                                | (intValues27 & 15));
	      out[outputOffset + 14] = (byte) (((intValues28 & 15) << 4)
	                                                | (intValues29 & 15));
	      out[outputOffset + 15] = (byte) (((intValues30 & 15) << 4)
	                                                | (intValues31 & 15));
		inpos.add(32);
		outpos.add(16);
	}
	
	//64 4bits
	protected static void fastpack79(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 15) << 4)
	                                                | (intValues1 & 15));
	      out[outputOffset + 1] = (byte) (((intValues2 & 15) << 4)
	                                                | (intValues3 & 15));
	      out[outputOffset + 2] = (byte) (((intValues4 & 15) << 4)
	                                                | (intValues5 & 15));
	      out[outputOffset + 3] = (byte) (((intValues6 & 15) << 4)
	                                                | (intValues7 & 15));
	      out[outputOffset + 4] = (byte) (((intValues8 & 15) << 4)
	                                                | (intValues9 & 15));
	      out[outputOffset + 5] = (byte) (((intValues10 & 15) << 4)
	                                                | (intValues11 & 15));
	      out[outputOffset + 6] = (byte) (((intValues12 & 15) << 4)
	                                                | (intValues13 & 15));
	      out[outputOffset + 7] = (byte) (((intValues14 & 15) << 4)
	                                                | (intValues15 & 15));
	      out[outputOffset + 8] = (byte) (((intValues16 & 15) << 4)
	                                                | (intValues17 & 15));
	      out[outputOffset + 9] = (byte) (((intValues18 & 15) << 4)
	                                                | (intValues19 & 15));
	      out[outputOffset + 10] = (byte) (((intValues20 & 15) << 4)
	                                                | (intValues21 & 15));
	      out[outputOffset + 11] = (byte) (((intValues22 & 15) << 4)
	                                                | (intValues23 & 15));
	      out[outputOffset + 12] = (byte) (((intValues24 & 15) << 4)
	                                                | (intValues25 & 15));
	      out[outputOffset + 13] = (byte) (((intValues26 & 15) << 4)
	                                                | (intValues27 & 15));
	      out[outputOffset + 14] = (byte) (((intValues28 & 15) << 4)
	                                                | (intValues29 & 15));
	      out[outputOffset + 15] = (byte) (((intValues30 & 15) << 4)
	                                                | (intValues31 & 15));
	      out[outputOffset + 16] = (byte) (((intValues32 & 15) << 4)
                  									| (intValues33 & 15));
	      out[outputOffset + 17] = (byte) (((intValues34 & 15) << 4)
													| (intValues35 & 15));
	      out[outputOffset + 18] = (byte) (((intValues36 & 15) << 4)
	    		  									| (intValues37 & 15));
	      out[outputOffset + 19] = (byte) (((intValues38 & 15) << 4)
	    		  									| (intValues39 & 15));
	      out[outputOffset + 20] = (byte) (((intValues40 & 15) << 4)
	    		  									| (intValues41 & 15));
	      out[outputOffset + 21] = (byte) (((intValues42 & 15) << 4)
	    		  									| (intValues43 & 15));
	      out[outputOffset + 22] = (byte) (((intValues44 & 15) << 4)
	    		  									| (intValues45 & 15));
	      out[outputOffset + 23] = (byte) (((intValues46 & 15) << 4)
	    		  									| (intValues47 & 15));
	      out[outputOffset + 24] = (byte) (((intValues48 & 15) << 4)
	    		  									| (intValues49 & 15));
	      out[outputOffset + 25] = (byte) (((intValues50 & 15) << 4)
	    		  									| (intValues51 & 15));
	      out[outputOffset + 26] = (byte) (((intValues52 & 15) << 4)
	    		  									| (intValues53 & 15));
	      out[outputOffset + 27] = (byte) (((intValues54 & 15) << 4)
	    		  									| (intValues55 & 15));
	      out[outputOffset + 28] = (byte) (((intValues56 & 15) << 4)
	    		  									| (intValues57 & 15));
	      out[outputOffset + 29] = (byte) (((intValues58 & 15) << 4)
	    		  									| (intValues59 & 15));
	      out[outputOffset + 30] = (byte) (((intValues60 & 15) << 4)
	    		  									| (intValues61 & 15));
	      out[outputOffset + 31] = (byte) (((intValues62 & 15) << 4)
	    		  									| (intValues63 & 15));
	      
		inpos.add(64);
		outpos.add(32);
	}
	
	//1 5bits
	protected static void fastpack80(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3));
		inpos.add(1);
		outpos.add(1);
	}
	//2 5bits
	protected static void fastpack81(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

		out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                | ((intValues1 >>> 2) & 0xFF));
		out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6));
		inpos.add(2);
		outpos.add(2);
	}
	// 3 5bits
	protected static void fastpack82(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1));
		inpos.add(3);
		outpos.add(2);
	}
	
	//4 5bits
	protected static void fastpack83(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4));
		inpos.add(4);
		outpos.add(3);
	}
	
	//5 5bits
	protected static void fastpack84(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
                  | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7));
		inpos.add(5);
		outpos.add(4);
	}
	
	//6 5bits
	protected static void fastpack85(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
                  | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
                  | ((intValues5 & 31) << 2));
		inpos.add(6);
		outpos.add(4);
	}
	
	//7 5bits
	protected static void fastpack86(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
                  | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
                  | ((intValues5 & 31) << 2)
                  | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5));
		inpos.add(7);
		outpos.add(5);
	}
	
	//8 5bits
	protected static void fastpack87(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
                  | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
                  | ((intValues5 & 31) << 2)
                  | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
                  | (intValues7 & 31));
		inpos.add(8);
		outpos.add(5);
	}
	
	//9 5bits
	protected static void fastpack88(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
                  | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
                  | ((intValues5 & 31) << 2)
                  | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
                  | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3));
		inpos.add(9);
		outpos.add(6);
	}
	
	//10 5bits
	protected static void fastpack89(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
                  | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
                  | ((intValues2 & 31) << 1)
                  | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
                  | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
                  | ((intValues5 & 31) << 2)
                  | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
                  | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
                  | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6));
		inpos.add(10);
		outpos.add(7);
	}
	
	//11 5bits
	protected static void fastpack90(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1));
		inpos.add(11);
		outpos.add(7);
	}
	
	//12 5bits
	protected static void fastpack91(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4));
		inpos.add(12);
		outpos.add(8);
	}
	
	//14 5bits
	protected static void fastpack92(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 1) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues12 & 1) << 7)
	                                                | ((intValues13 & 31) << 2));
		inpos.add(14);
		outpos.add(9);
	}
	
	//16 5bits
	protected static void fastpack93(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 1) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues12 & 1) << 7)
	                                                | ((intValues13 & 31) << 2)
	                                                | ((intValues14 >>> 3) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues14 & 7) << 5)
	                                                | (intValues15 & 31));
		inpos.add(16);
		outpos.add(10);
	}
	
	//32 5bits
	protected static void fastpack94(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 1) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues12 & 1) << 7)
	                                                | ((intValues13 & 31) << 2)
	                                                | ((intValues14 >>> 3) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues14 & 7) << 5)
	                                                | (intValues15 & 31));
	      out[outputOffset + 10] = (byte) (((intValues16 & 31) << 3)
	                                                | ((intValues17 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues17 & 3) << 6)
	                                                | ((intValues18 & 31) << 1)
	                                                | ((intValues19 >>> 4) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues19 & 15) << 4)
	                                                | ((intValues20 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues20 & 1) << 7)
	                                                | ((intValues21 & 31) << 2)
	                                                | ((intValues22 >>> 3) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues22 & 7) << 5)
	                                                | (intValues23 & 31));
	      out[outputOffset + 15] = (byte) (((intValues24 & 31) << 3)
	                                                | ((intValues25 >>> 2) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues25 & 3) << 6)
	                                                | ((intValues26 & 31) << 1)
	                                                | ((intValues27 >>> 4) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues27 & 15) << 4)
	                                                | ((intValues28 >>> 1) & 0xFF));
	      out[outputOffset + 18] = (byte) (((intValues28 & 1) << 7)
	                                                | ((intValues29 & 31) << 2)
	                                                | ((intValues30 >>> 3) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues30 & 7) << 5)
	                                                | (intValues31 & 31));
		inpos.add(32);
		outpos.add(20);
	}
	
	//64 5 bits
	protected static void fastpack95(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 31) << 3)
	                                                | ((intValues1 >>> 2) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 3) << 6)
	                                                | ((intValues2 & 31) << 1)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 1) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues4 & 1) << 7)
	                                                | ((intValues5 & 31) << 2)
	                                                | ((intValues6 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues6 & 7) << 5)
	                                                | (intValues7 & 31));
	      out[outputOffset + 5] = (byte) (((intValues8 & 31) << 3)
	                                                | ((intValues9 >>> 2) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues9 & 3) << 6)
	                                                | ((intValues10 & 31) << 1)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 1) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues12 & 1) << 7)
	                                                | ((intValues13 & 31) << 2)
	                                                | ((intValues14 >>> 3) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues14 & 7) << 5)
	                                                | (intValues15 & 31));
	      out[outputOffset + 10] = (byte) (((intValues16 & 31) << 3)
	                                                | ((intValues17 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues17 & 3) << 6)
	                                                | ((intValues18 & 31) << 1)
	                                                | ((intValues19 >>> 4) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues19 & 15) << 4)
	                                                | ((intValues20 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues20 & 1) << 7)
	                                                | ((intValues21 & 31) << 2)
	                                                | ((intValues22 >>> 3) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues22 & 7) << 5)
	                                                | (intValues23 & 31));
	      out[outputOffset + 15] = (byte) (((intValues24 & 31) << 3)
	                                                | ((intValues25 >>> 2) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues25 & 3) << 6)
	                                                | ((intValues26 & 31) << 1)
	                                                | ((intValues27 >>> 4) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues27 & 15) << 4)
	                                                | ((intValues28 >>> 1) & 0xFF));
	      out[outputOffset + 18] = (byte) (((intValues28 & 1) << 7)
	                                                | ((intValues29 & 31) << 2)
	                                                | ((intValues30 >>> 3) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues30 & 7) << 5)
	                                                | (intValues31 & 31));

	      out[outputOffset + 20] = (byte) (((intValues32 & 31) << 3)
	                                                | ((intValues33 >>> 2) & 0xFF));
	      out[outputOffset + 21] = (byte) (((intValues33 & 3) << 6)
	                                                | ((intValues34 & 31) << 1)
	                                                | ((intValues35 >>> 4) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues35 & 15) << 4)
	                                                | ((intValues36 >>> 1) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues36 & 1) << 7)
	                                                | ((intValues37 & 31) << 2)
	                                                | ((intValues38 >>> 3) & 0xFF));
	      out[outputOffset + 24] = (byte) (((intValues38 & 7) << 5)
	                                                | (intValues39 & 31));
	      out[outputOffset + 25] = (byte) (((intValues40 & 31) << 3)
	                                                | ((intValues41 >>> 2) & 0xFF));
	      out[outputOffset + 26] = (byte) (((intValues41 & 3) << 6)
	                                                | ((intValues42 & 31) << 1)
	                                                | ((intValues43 >>> 4) & 0xFF));
	      out[outputOffset + 27] = (byte) (((intValues43 & 15) << 4)
	                                                | ((intValues44 >>> 1) & 0xFF));
	      out[outputOffset + 28] = (byte) (((intValues44 & 1) << 7)
	                                                | ((intValues45 & 31) << 2)
	                                                | ((intValues46 >>> 3) & 0xFF));
	      out[outputOffset + 29] = (byte) (((intValues46 & 7) << 5)
	                                                | (intValues47 & 31));
	      out[outputOffset + 30] = (byte) (((intValues48 & 31) << 3)
	                                                | ((intValues49 >>> 2) & 0xFF));
	      out[outputOffset + 31] = (byte) (((intValues49 & 3) << 6)
	                                                | ((intValues50 & 31) << 1)
	                                                | ((intValues51 >>> 4) & 0xFF));
	      out[outputOffset + 32] = (byte) (((intValues51 & 15) << 4)
	                                                | ((intValues52 >>> 1) & 0xFF));
	      out[outputOffset + 33] = (byte) (((intValues52 & 1) << 7)
	                                                | ((intValues53 & 31) << 2)
	                                                | ((intValues54 >>> 3) & 0xFF));
	      out[outputOffset + 34] = (byte) (((intValues54 & 7) << 5)
	                                                | (intValues55 & 31));
	      out[outputOffset + 35] = (byte) (((intValues56 & 31) << 3)
	                                                | ((intValues57 >>> 2) & 0xFF));
	      out[outputOffset + 36] = (byte) (((intValues57 & 3) << 6)
	                                                | ((intValues58 & 31) << 1)
	                                                | ((intValues59 >>> 4) & 0xFF));
	      out[outputOffset + 37] = (byte) (((intValues59 & 15) << 4)
	                                                | ((intValues60 >>> 1) & 0xFF));
	      out[outputOffset + 38] = (byte) (((intValues60 & 1) << 7)
	                                                | ((intValues61 & 31) << 2)
	                                                | ((intValues62 >>> 3) & 0xFF));
	      out[outputOffset + 39] = (byte) (((intValues62 & 7) << 5)
	                                                | (intValues63 & 31));
		inpos.add(64);
		outpos.add(40);
	}
	
	//1 6bits
	protected static void fastpack96(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2));
		inpos.add(1);
		outpos.add(1);
	}
	
	//2 6bits
	protected static void fastpack97(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4));
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 6bits
	protected static void fastpack98(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
                  | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6));
		inpos.add(3);
		outpos.add(3);
	}
	
	//4 6bits
	protected static void fastpack99(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
                  | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
                  | (intValues3 & 63));
		inpos.add(4);
		outpos.add(3);
	}
	
	//5 6bits
	protected static void fastpack100(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
                  | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
                  | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2));
		inpos.add(5);
		outpos.add(4);
	}
	
	//6 6bits
	protected static void fastpack101(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
                  | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
                  | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
                  | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4));
		inpos.add(6);
		outpos.add(5);
	}
	
	//7 6bits
	protected static void fastpack102(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	     final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
                  | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
                  | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
                  | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
                  | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6));
		inpos.add(7);
		outpos.add(6);
	}
	
	//8 6bits
	protected static void fastpack103(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
                  | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
                  | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
                  | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
                  | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
                  | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
                  | (intValues7 & 63));
		inpos.add(8);
		outpos.add(6);
	}
	
	//9 6bits
	protected static void fastpack104(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2));

		inpos.add(9);
		outpos.add(7);
	}
	
	//10 6bits
	protected static void fastpack105(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4));
		inpos.add(10);
		outpos.add(8);
	}
	
	//11 6bits
	protected static void fastpack106(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6));
		inpos.add(11);
		outpos.add(9);
	}
	
	//12 6bits
	protected static void fastpack107(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
		inpos.add(12);
		outpos.add(9);
	}
	
	//14 6bits
	protected static void fastpack108(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
	      out[outputOffset + 9] = (byte) (((intValues12 & 63) << 2)
	                                                | ((intValues13 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues13 & 15) << 4));
		inpos.add(14);
		outpos.add(11);
	}
	
	//16 6bits
	protected static void fastpack109(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
	      out[outputOffset + 9] = (byte) (((intValues12 & 63) << 2)
	                                                | ((intValues13 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues13 & 15) << 4)
	                                                | ((intValues14 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues14 & 3) << 6)
	                                                | (intValues15 & 63));
		inpos.add(16);
		outpos.add(12);
	}
	
	//32 6bits
	protected static void fastpack110(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
	      out[outputOffset + 9] = (byte) (((intValues12 & 63) << 2)
	                                                | ((intValues13 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues13 & 15) << 4)
	                                                | ((intValues14 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues14 & 3) << 6)
	                                                | (intValues15 & 63));
	      out[outputOffset + 12] = (byte) (((intValues16 & 63) << 2)
	                                                | ((intValues17 >>> 4) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues17 & 15) << 4)
	                                                | ((intValues18 >>> 2) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues18 & 3) << 6)
	                                                | (intValues19 & 63));
	      out[outputOffset + 15] = (byte) (((intValues20 & 63) << 2)
	                                                | ((intValues21 >>> 4) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues21 & 15) << 4)
	                                                | ((intValues22 >>> 2) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues22 & 3) << 6)
	                                                | (intValues23 & 63));
	      out[outputOffset + 18] = (byte) (((intValues24 & 63) << 2)
	                                                | ((intValues25 >>> 4) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues25 & 15) << 4)
	                                                | ((intValues26 >>> 2) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues26 & 3) << 6)
	                                                | (intValues27 & 63));
	      out[outputOffset + 21] = (byte) (((intValues28 & 63) << 2)
	                                                | ((intValues29 >>> 4) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues29 & 15) << 4)
	                                                | ((intValues30 >>> 2) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues30 & 3) << 6)
	                                                | (intValues31 & 63));
		inpos.add(32);
		outpos.add(24);
	}
	
	//64 6bits
	protected static void fastpack111(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 63) << 2)
	                                                | ((intValues1 >>> 4) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 15) << 4)
	                                                | ((intValues2 >>> 2) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 3) << 6)
	                                                | (intValues3 & 63));
	      out[outputOffset + 3] = (byte) (((intValues4 & 63) << 2)
	                                                | ((intValues5 >>> 4) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues5 & 15) << 4)
	                                                | ((intValues6 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues6 & 3) << 6)
	                                                | (intValues7 & 63));
	      out[outputOffset + 6] = (byte) (((intValues8 & 63) << 2)
	                                                | ((intValues9 >>> 4) & 0xFF));
	      out[outputOffset + 7] = (byte) (((intValues9 & 15) << 4)
	                                                | ((intValues10 >>> 2) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues10 & 3) << 6)
	                                                | (intValues11 & 63));
	      out[outputOffset + 9] = (byte) (((intValues12 & 63) << 2)
	                                                | ((intValues13 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues13 & 15) << 4)
	                                                | ((intValues14 >>> 2) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues14 & 3) << 6)
	                                                | (intValues15 & 63));
	      out[outputOffset + 12] = (byte) (((intValues16 & 63) << 2)
	                                                | ((intValues17 >>> 4) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues17 & 15) << 4)
	                                                | ((intValues18 >>> 2) & 0xFF));
	      out[outputOffset + 14] = (byte) (((intValues18 & 3) << 6)
	                                                | (intValues19 & 63));
	      out[outputOffset + 15] = (byte) (((intValues20 & 63) << 2)
	                                                | ((intValues21 >>> 4) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues21 & 15) << 4)
	                                                | ((intValues22 >>> 2) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues22 & 3) << 6)
	                                                | (intValues23 & 63));
	      out[outputOffset + 18] = (byte) (((intValues24 & 63) << 2)
	                                                | ((intValues25 >>> 4) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues25 & 15) << 4)
	                                                | ((intValues26 >>> 2) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues26 & 3) << 6)
	                                                | (intValues27 & 63));
	      out[outputOffset + 21] = (byte) (((intValues28 & 63) << 2)
	                                                | ((intValues29 >>> 4) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues29 & 15) << 4)
	                                                | ((intValues30 >>> 2) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues30 & 3) << 6)
	                                                | (intValues31 & 63));
	      out[outputOffset + 24] = (byte) (((intValues32 & 63) << 2)
	    		  									| ((intValues33 >>> 4) & 0xFF));
		  out[outputOffset + 25] = (byte) (((intValues33 & 15) << 4)
				  									| ((intValues34 >>> 2) & 0xFF));
		  out[outputOffset + 26] = (byte) (((intValues34 & 3) << 6)
				  									| (intValues35 & 63));
		  out[outputOffset + 27] = (byte) (((intValues36 & 63) << 2)
				  									| ((intValues37 >>> 4) & 0xFF));
		  out[outputOffset + 28] = (byte) (((intValues37 & 15) << 4)
				  									| ((intValues38 >>> 2) & 0xFF));
		  out[outputOffset + 29] = (byte) (((intValues38 & 3) << 6)
				  									| (intValues39 & 63));
		  out[outputOffset + 30] = (byte) (((intValues40 & 63) << 2)
				  									| ((intValues41 >>> 4) & 0xFF));
		  out[outputOffset + 31] = (byte) (((intValues41 & 15) << 4)
				  									| ((intValues42 >>> 2) & 0xFF));
		  out[outputOffset + 32] = (byte) (((intValues42 & 3) << 6)
				  									| (intValues43 & 63));
		  out[outputOffset + 33] = (byte) (((intValues44 & 63) << 2)
				  									| ((intValues45 >>> 4) & 0xFF));
		  out[outputOffset + 34] = (byte) (((intValues45 & 15) << 4)
				  									| ((intValues46 >>> 2) & 0xFF));
		  out[outputOffset + 35] = (byte) (((intValues46 & 3) << 6)
				  									| (intValues47 & 63));
		  out[outputOffset + 36] = (byte) (((intValues48 & 63) << 2)
				  									| ((intValues49 >>> 4) & 0xFF));
		  out[outputOffset + 37] = (byte) (((intValues49 & 15) << 4)
				  									| ((intValues50 >>> 2) & 0xFF));
		  out[outputOffset + 38] = (byte) (((intValues50 & 3) << 6)
				  									| (intValues51 & 63));
		  out[outputOffset + 39] = (byte) (((intValues52 & 63) << 2)
				  									| ((intValues53 >>> 4) & 0xFF));
		  out[outputOffset + 40] = (byte) (((intValues53 & 15) << 4)
				  									| ((intValues54 >>> 2) & 0xFF));
		  out[outputOffset + 41] = (byte) (((intValues54 & 3) << 6)
				  									| (intValues55 & 63));
		  out[outputOffset + 42] = (byte) (((intValues56 & 63) << 2)
				  									| ((intValues57 >>> 4) & 0xFF));
		  out[outputOffset + 43] = (byte) (((intValues57 & 15) << 4)
				  									| ((intValues58 >>> 2) & 0xFF));
		  out[outputOffset + 44] = (byte) (((intValues58 & 3) << 6)
				  									| (intValues59 & 63));
		  out[outputOffset + 45] = (byte) (((intValues60 & 63) << 2)
				  									| ((intValues61 >>> 4) & 0xFF));
		  out[outputOffset + 46] = (byte) (((intValues61 & 15) << 4)
				  									| ((intValues62 >>> 2) & 0xFF));
		  out[outputOffset + 47] = (byte) (((intValues62 & 3) << 6)
				  									| (intValues63 & 63));
		inpos.add(64);
		outpos.add(48);
	}
	
	//1 7bit
	protected static void fastpack112(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1));
		inpos.add(1);
		outpos.add(1);
	}
	
	//2 7bits
	protected static void fastpack113(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
                  | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2));
	      
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 7bits
	protected static void fastpack114(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3));
		inpos.add(3);
		outpos.add(3);
	}
	
	//4 7bits
	protected static void fastpack115(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4));
		inpos.add(4);
		outpos.add(4);
	}
	
	//5 7bits
	protected static void fastpack116(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5));
		inpos.add(5);
		outpos.add(5);
	}
	
	//6 7bits
	protected static void fastpack117(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6));
		inpos.add(6);
		outpos.add(6);
	}
	
	//7 7bits
	protected static void fastpack118(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7));
		inpos.add(7);
		outpos.add(7);
	}
	
	//8 7bits
	protected static void fastpack119(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
		inpos.add(8);
		outpos.add(7);
	}
	
	//9 7bits
	protected static void fastpack120(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1));
		inpos.add(9);
		outpos.add(8);
	}
	
	//10 7bits
	protected static void fastpack121(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2));
		inpos.add(10);
		outpos.add(9);
	}
	
	//11 7bits
	protected static void fastpack122(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3));
		inpos.add(11);
		outpos.add(10);
	}
	
	//12 7bits
	protected static void fastpack123(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4));
		inpos.add(12);
		outpos.add(11);
	}
	
	//14 7bits
	protected static void fastpack124(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 3) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues12 & 7) << 5)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues13 & 3) << 6));
		inpos.add(14);
		outpos.add(13);
	}
	
	//16 7bits
	protected static void fastpack125(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 3) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues12 & 7) << 5)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues13 & 3) << 6)
	                                                | ((intValues14 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues14 & 1) << 7)
	                                                | (intValues15 & 127));
		inpos.add(16);
		outpos.add(14);
	}
	
	//32 7bits
	protected static void fastpack126(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 3) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues12 & 7) << 5)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues13 & 3) << 6)
	                                                | ((intValues14 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues14 & 1) << 7)
	                                                | (intValues15 & 127));
	      out[outputOffset + 14] = (byte) (((intValues16 & 127) << 1)
	                                                | ((intValues17 >>> 6) & 0xFF));
	      out[outputOffset + 15] = (byte) (((intValues17 & 63) << 2)
	                                                | ((intValues18 >>> 5) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues18 & 31) << 3)
	                                                | ((intValues19 >>> 4) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues19 & 15) << 4)
	                                                | ((intValues20 >>> 3) & 0xFF));
	      out[outputOffset + 18] = (byte) (((intValues20 & 7) << 5)
	                                                | ((intValues21 >>> 2) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues21 & 3) << 6)
	                                                | ((intValues22 >>> 1) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues22 & 1) << 7)
	                                                | (intValues23 & 127));
	      out[outputOffset + 21] = (byte) (((intValues24 & 127) << 1)
	                                                | ((intValues25 >>> 6) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues25 & 63) << 2)
	                                                | ((intValues26 >>> 5) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues26 & 31) << 3)
	                                                | ((intValues27 >>> 4) & 0xFF));
	      out[outputOffset + 24] = (byte) (((intValues27 & 15) << 4)
	                                                | ((intValues28 >>> 3) & 0xFF));
	      out[outputOffset + 25] = (byte) (((intValues28 & 7) << 5)
	                                                | ((intValues29 >>> 2) & 0xFF));
	      out[outputOffset + 26] = (byte) (((intValues29 & 3) << 6)
	                                                | ((intValues30 >>> 1) & 0xFF));
	      out[outputOffset + 27] = (byte) (((intValues30 & 1) << 7)
	                                                | (intValues31 & 127));
		inpos.add(32);
		outpos.add(28);
	}
	
	//64 7bits
	protected static void fastpack127(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) (((intValues0 & 127) << 1)
	                                                | ((intValues1 >>> 6) & 0xFF));
	      out[outputOffset + 1] = (byte) (((intValues1 & 63) << 2)
	                                                | ((intValues2 >>> 5) & 0xFF));
	      out[outputOffset + 2] = (byte) (((intValues2 & 31) << 3)
	                                                | ((intValues3 >>> 4) & 0xFF));
	      out[outputOffset + 3] = (byte) (((intValues3 & 15) << 4)
	                                                | ((intValues4 >>> 3) & 0xFF));
	      out[outputOffset + 4] = (byte) (((intValues4 & 7) << 5)
	                                                | ((intValues5 >>> 2) & 0xFF));
	      out[outputOffset + 5] = (byte) (((intValues5 & 3) << 6)
	                                                | ((intValues6 >>> 1) & 0xFF));
	      out[outputOffset + 6] = (byte) (((intValues6 & 1) << 7)
	                                                | (intValues7 & 127));
	      out[outputOffset + 7] = (byte) (((intValues8 & 127) << 1)
	                                                | ((intValues9 >>> 6) & 0xFF));
	      out[outputOffset + 8] = (byte) (((intValues9 & 63) << 2)
	                                                | ((intValues10 >>> 5) & 0xFF));
	      out[outputOffset + 9] = (byte) (((intValues10 & 31) << 3)
	                                                | ((intValues11 >>> 4) & 0xFF));
	      out[outputOffset + 10] = (byte) (((intValues11 & 15) << 4)
	                                                | ((intValues12 >>> 3) & 0xFF));
	      out[outputOffset + 11] = (byte) (((intValues12 & 7) << 5)
	                                                | ((intValues13 >>> 2) & 0xFF));
	      out[outputOffset + 12] = (byte) (((intValues13 & 3) << 6)
	                                                | ((intValues14 >>> 1) & 0xFF));
	      out[outputOffset + 13] = (byte) (((intValues14 & 1) << 7)
	                                                | (intValues15 & 127));
	      out[outputOffset + 14] = (byte) (((intValues16 & 127) << 1)
	                                                | ((intValues17 >>> 6) & 0xFF));
	      out[outputOffset + 15] = (byte) (((intValues17 & 63) << 2)
	                                                | ((intValues18 >>> 5) & 0xFF));
	      out[outputOffset + 16] = (byte) (((intValues18 & 31) << 3)
	                                                | ((intValues19 >>> 4) & 0xFF));
	      out[outputOffset + 17] = (byte) (((intValues19 & 15) << 4)
	                                                | ((intValues20 >>> 3) & 0xFF));
	      out[outputOffset + 18] = (byte) (((intValues20 & 7) << 5)
	                                                | ((intValues21 >>> 2) & 0xFF));
	      out[outputOffset + 19] = (byte) (((intValues21 & 3) << 6)
	                                                | ((intValues22 >>> 1) & 0xFF));
	      out[outputOffset + 20] = (byte) (((intValues22 & 1) << 7)
	                                                | (intValues23 & 127));
	      out[outputOffset + 21] = (byte) (((intValues24 & 127) << 1)
	                                                | ((intValues25 >>> 6) & 0xFF));
	      out[outputOffset + 22] = (byte) (((intValues25 & 63) << 2)
	                                                | ((intValues26 >>> 5) & 0xFF));
	      out[outputOffset + 23] = (byte) (((intValues26 & 31) << 3)
	                                                | ((intValues27 >>> 4) & 0xFF));
	      out[outputOffset + 24] = (byte) (((intValues27 & 15) << 4)
	                                                | ((intValues28 >>> 3) & 0xFF));
	      out[outputOffset + 25] = (byte) (((intValues28 & 7) << 5)
	                                                | ((intValues29 >>> 2) & 0xFF));
	      out[outputOffset + 26] = (byte) (((intValues29 & 3) << 6)
	                                                | ((intValues30 >>> 1) & 0xFF));
	      out[outputOffset + 27] = (byte) (((intValues30 & 1) << 7)
	                                                | (intValues31 & 127));
	      out[outputOffset + 28] = (byte) (((intValues32 & 127) << 1)
	    		  									| ((intValues33 >>> 6) & 0xFF));
	      out[outputOffset + 29] = (byte) (((intValues33 & 63) << 2)
	    		  									| ((intValues34 >>> 5) & 0xFF));
	      out[outputOffset + 30] = (byte) (((intValues34 & 31) << 3)
	    		  									| ((intValues35 >>> 4) & 0xFF));
	      out[outputOffset + 31] = (byte) (((intValues35 & 15) << 4)
                  									| ((intValues36 >>> 3) & 0xFF));
	      out[outputOffset + 32] = (byte) (((intValues36 & 7) << 5)
	    		  									| ((intValues37 >>> 2) & 0xFF));
	      out[outputOffset + 33] = (byte) (((intValues37 & 3) << 6)
	    		  									| ((intValues38 >>> 1) & 0xFF));
	      out[outputOffset + 34] = (byte) (((intValues38 & 1) << 7)
	    		  									| (intValues39 & 127));
	      out[outputOffset + 35] = (byte) (((intValues40 & 127) << 1)
	    		  									| ((intValues41 >>> 6) & 0xFF));
	      out[outputOffset + 36] = (byte) (((intValues41 & 63) << 2)
	    		  									| ((intValues42 >>> 5) & 0xFF));
	      out[outputOffset + 37] = (byte) (((intValues42 & 31) << 3)
	    		  									| ((intValues43 >>> 4) & 0xFF));
	      out[outputOffset + 38] = (byte) (((intValues43 & 15) << 4)
	    		  									| ((intValues44 >>> 3) & 0xFF));
	      out[outputOffset + 39] = (byte) (((intValues44 & 7) << 5)
	    		  									| ((intValues45 >>> 2) & 0xFF));
	      out[outputOffset + 40] = (byte) (((intValues45 & 3) << 6)
	    		  									| ((intValues46 >>> 1) & 0xFF));
	      out[outputOffset + 41] = (byte) (((intValues46 & 1) << 7)
	    		  									| (intValues47 & 127));
	      out[outputOffset + 42] = (byte) (((intValues48 & 127) << 1)
	    		  									| ((intValues49 >>> 6) & 0xFF));
	      out[outputOffset + 43] = (byte) (((intValues49 & 63) << 2)
	    		  									| ((intValues50 >>> 5) & 0xFF));
	      out[outputOffset + 44] = (byte) (((intValues50 & 31) << 3)
	    		  									| ((intValues51 >>> 4) & 0xFF));
	      out[outputOffset + 45] = (byte) (((intValues51 & 15) << 4)
	    		  									| ((intValues52 >>> 3) & 0xFF));
	      out[outputOffset + 46] = (byte) (((intValues52 & 7) << 5)
	    		  									| ((intValues53 >>> 2) & 0xFF));
	      out[outputOffset + 47] = (byte) (((intValues53 & 3) << 6)
	    		  									| ((intValues54 >>> 1) & 0xFF));
	      out[outputOffset + 48] = (byte) (((intValues54 & 1) << 7)
	    		  									| (intValues55 & 127));
	      out[outputOffset + 49] = (byte) (((intValues56 & 127) << 1)
	    		  									| ((intValues57 >>> 6) & 0xFF));
	      out[outputOffset + 50] = (byte) (((intValues57 & 63) << 2)
	    		  									| ((intValues58 >>> 5) & 0xFF));
	      out[outputOffset + 51] = (byte) (((intValues58 & 31) << 3)
	    		  									| ((intValues59 >>> 4) & 0xFF));
	      out[outputOffset + 52] = (byte) (((intValues59 & 15) << 4)
	    		  									| ((intValues60 >>> 3) & 0xFF));
	      out[outputOffset + 53] = (byte) (((intValues60 & 7) << 5)
	    		  									| ((intValues61 >>> 2) & 0xFF));
	      out[outputOffset + 54] = (byte) (((intValues61 & 3) << 6)
	    		  									| ((intValues62 >>> 1) & 0xFF));
	      out[outputOffset + 55] = (byte) (((intValues62 & 1) << 7)
	    		  									| (intValues63 & 127));
		inpos.add(64);
		outpos.add(56);
	}
	
	//1 8bits
	protected static void fastpack128(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
		inpos.add(1);
		outpos.add(1);
	}
	
	//2 8bits
	protected static void fastpack129(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 8bits
	protected static void fastpack130(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
		inpos.add(3);
		outpos.add(3);
	}
	
	//4 8bits
	protected static void fastpack131(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
		inpos.add(4);
		outpos.add(4);
	}
	
	//5 8bits
	protected static void fastpack132(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
		inpos.add(5);
		outpos.add(5);
	}
	
	//6 8bits
	protected static void fastpack133(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
		inpos.add(6);
		outpos.add(6);
	}
	
	//7 8bits
	protected static void fastpack134(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
		inpos.add(7);
		outpos.add(7);
	}
	
	//8 8bits
	protected static void fastpack135(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
		inpos.add(8);
		outpos.add(8);
	}
	
	//9 8bits
	protected static void fastpack136(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
		inpos.add(9);
		outpos.add(9);
	}
	
	//10 8bits
	protected static void fastpack137(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
		inpos.add(10);
		outpos.add(10);
	}
	
	//11 8bits
	protected static void fastpack138(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
		inpos.add(11);
		outpos.add(11);
	}
	
	//12 8bits
	protected static void fastpack139(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
		inpos.add(12);
		outpos.add(12);
	}
	
	//14 8bits
	protected static void fastpack140(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
	      out[outputOffset + 12] = (byte) ((intValues12 & 255));
	      out[outputOffset + 13] = (byte) ((intValues13 & 255));
		inpos.add(14);
		outpos.add(14);
	}
	
	//16 8bits
	protected static void fastpack141(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
	      out[outputOffset + 12] = (byte) ((intValues12 & 255));
	      out[outputOffset + 13] = (byte) ((intValues13 & 255));
	      out[outputOffset + 14] = (byte) ((intValues14 & 255));
	      out[outputOffset + 15] = (byte) ((intValues15 & 255));
		inpos.add(16);
		outpos.add(16);
	}
	
	//32 8bits
	protected static void fastpack142(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
	      out[outputOffset + 12] = (byte) ((intValues12 & 255));
	      out[outputOffset + 13] = (byte) ((intValues13 & 255));
	      out[outputOffset + 14] = (byte) ((intValues14 & 255));
	      out[outputOffset + 15] = (byte) ((intValues15 & 255));
	      out[outputOffset + 16] = (byte) ((intValues16 & 255));
	      out[outputOffset + 17] = (byte) ((intValues17 & 255));
	      out[outputOffset + 18] = (byte) ((intValues18 & 255));
	      out[outputOffset + 19] = (byte) ((intValues19 & 255));
	      out[outputOffset + 20] = (byte) ((intValues20 & 255));
	      out[outputOffset + 21] = (byte) ((intValues21 & 255));
	      out[outputOffset + 22] = (byte) ((intValues22 & 255));
	      out[outputOffset + 23] = (byte) ((intValues23 & 255));
	      out[outputOffset + 24] = (byte) ((intValues24 & 255));
	      out[outputOffset + 25] = (byte) ((intValues25 & 255));
	      out[outputOffset + 26] = (byte) ((intValues26 & 255));
	      out[outputOffset + 27] = (byte) ((intValues27 & 255));
	      out[outputOffset + 28] = (byte) ((intValues28 & 255));
	      out[outputOffset + 29] = (byte) ((intValues29 & 255));
	      out[outputOffset + 30] = (byte) ((intValues30 & 255));
	      out[outputOffset + 31] = (byte) ((intValues31 & 255));
		inpos.add(32);
		outpos.add(32);
	}
	
	//64 8bits
	protected static void fastpack143(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];
	      
	      out[outputOffset + 0] = (byte) ((intValues0 & 255));
	      out[outputOffset + 1] = (byte) ((intValues1 & 255));
	      out[outputOffset + 2] = (byte) ((intValues2 & 255));
	      out[outputOffset + 3] = (byte) ((intValues3 & 255));
	      out[outputOffset + 4] = (byte) ((intValues4 & 255));
	      out[outputOffset + 5] = (byte) ((intValues5 & 255));
	      out[outputOffset + 6] = (byte) ((intValues6 & 255));
	      out[outputOffset + 7] = (byte) ((intValues7 & 255));
	      out[outputOffset + 8] = (byte) ((intValues8 & 255));
	      out[outputOffset + 9] = (byte) ((intValues9 & 255));
	      out[outputOffset + 10] = (byte) ((intValues10 & 255));
	      out[outputOffset + 11] = (byte) ((intValues11 & 255));
	      out[outputOffset + 12] = (byte) ((intValues12 & 255));
	      out[outputOffset + 13] = (byte) ((intValues13 & 255));
	      out[outputOffset + 14] = (byte) ((intValues14 & 255));
	      out[outputOffset + 15] = (byte) ((intValues15 & 255));
	      out[outputOffset + 16] = (byte) ((intValues16 & 255));
	      out[outputOffset + 17] = (byte) ((intValues17 & 255));
	      out[outputOffset + 18] = (byte) ((intValues18 & 255));
	      out[outputOffset + 19] = (byte) ((intValues19 & 255));
	      out[outputOffset + 20] = (byte) ((intValues20 & 255));
	      out[outputOffset + 21] = (byte) ((intValues21 & 255));
	      out[outputOffset + 22] = (byte) ((intValues22 & 255));
	      out[outputOffset + 23] = (byte) ((intValues23 & 255));
	      out[outputOffset + 24] = (byte) ((intValues24 & 255));
	      out[outputOffset + 25] = (byte) ((intValues25 & 255));
	      out[outputOffset + 26] = (byte) ((intValues26 & 255));
	      out[outputOffset + 27] = (byte) ((intValues27 & 255));
	      out[outputOffset + 28] = (byte) ((intValues28 & 255));
	      out[outputOffset + 29] = (byte) ((intValues29 & 255));
	      out[outputOffset + 30] = (byte) ((intValues30 & 255));
	      out[outputOffset + 31] = (byte) ((intValues31 & 255));
	      out[outputOffset + 32] = (byte) ((intValues32 & 255));
	      out[outputOffset + 33] = (byte) ((intValues33 & 255));
	      out[outputOffset + 34] = (byte) ((intValues34 & 255));
	      out[outputOffset + 35] = (byte) ((intValues35 & 255));
	      out[outputOffset + 36] = (byte) ((intValues36 & 255));
	      out[outputOffset + 37] = (byte) ((intValues37 & 255));
	      out[outputOffset + 38] = (byte) ((intValues38 & 255));
	      out[outputOffset + 39] = (byte) ((intValues39 & 255));
	      out[outputOffset + 40] = (byte) ((intValues40 & 255));
	      out[outputOffset + 41] = (byte) ((intValues41 & 255));
	      out[outputOffset + 42] = (byte) ((intValues42 & 255));
	      out[outputOffset + 43] = (byte) ((intValues43 & 255));
	      out[outputOffset + 44] = (byte) ((intValues44 & 255));
	      out[outputOffset + 45] = (byte) ((intValues45 & 255));
	      out[outputOffset + 46] = (byte) ((intValues46 & 255));
	      out[outputOffset + 47] = (byte) ((intValues47 & 255));
	      out[outputOffset + 48] = (byte) ((intValues48 & 255));
	      out[outputOffset + 49] = (byte) ((intValues49 & 255));
	      out[outputOffset + 50] = (byte) ((intValues50 & 255));
	      out[outputOffset + 51] = (byte) ((intValues51 & 255));
	      out[outputOffset + 52] = (byte) ((intValues52 & 255));
	      out[outputOffset + 53] = (byte) ((intValues53 & 255));
	      out[outputOffset + 54] = (byte) ((intValues54 & 255));
	      out[outputOffset + 55] = (byte) ((intValues55 & 255));
	      out[outputOffset + 56] = (byte) ((intValues56 & 255));
	      out[outputOffset + 57] = (byte) ((intValues57 & 255));
	      out[outputOffset + 58] = (byte) ((intValues58 & 255));
	      out[outputOffset + 59] = (byte) ((intValues59 & 255));
	      out[outputOffset + 60] = (byte) ((intValues60 & 255));
	      out[outputOffset + 61] = (byte) ((intValues61 & 255));
	      out[outputOffset + 62] = (byte) ((intValues62 & 255));
	      out[outputOffset + 63] = (byte) ((intValues63 & 255));
		inpos.add(64);
		outpos.add(64);
	}
	
	//1 9bits
	protected static void fastpack144(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7);
	      
		inpos.add(1);
		outpos.add(2);
	}
	
	//2 9bits
	protected static void fastpack145(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6);
		inpos.add(2);
		outpos.add(3);
	}
	
	//3 9bits
	protected static void fastpack146(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5);
		inpos.add(3);
		outpos.add(4);
	}
	
	//4 9bits
	protected static void fastpack147(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4);

		inpos.add(4);
		outpos.add(5);
	}
	
	//5 9bits
	protected static void fastpack148(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3);
		inpos.add(5);
		outpos.add(6);
	}
	
	//6 9bits
	protected static void fastpack149(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2);
		inpos.add(6);
		outpos.add(7);
	}
	
	//7 9bits
	protected static void fastpack150(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1);
		inpos.add(7);
		outpos.add(8);
	}
	
	//8 9bits
	protected static void fastpack151(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(9);
	}
	
	//9 9bits
	protected static void fastpack152(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7);
		inpos.add(9);
		outpos.add(11);
	}
	
	//10 9bits
	protected static void fastpack153(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6);
		inpos.add(10);
		outpos.add(12);
	}
	
	//11 9bits
	protected static void fastpack154(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5);
		inpos.add(11);
		outpos.add(13);
	}
	
	//12 9bits
	protected static void fastpack155(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4);
		inpos.add(12);
		outpos.add(14);
	}
	
	//14 9bits
	protected static void fastpack156(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues13 & 63) << 2);
		inpos.add(14);
		outpos.add(16);
	}
	
	//16 9bits
	protected static void fastpack157(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(18);
	}
	
	//32 9bits
	protected static void fastpack158(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues16 >>> 1) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues16 & 1) << 7
	                                                | (intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 3) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues18 & 7) << 5
	                                                | (intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues20 & 31) << 3
	                                                | (intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 7) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues22 & 127) << 1
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues24 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues24 & 1) << 7
	                                                | (intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 3) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues26 & 7) << 5
	                                                | (intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 5) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues28 & 31) << 3
	                                                | (intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 7) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues30 & 127) << 1
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(36);
	}
	
	//64 9bits
	protected static void fastpack159(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 1) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 1) << 7
	                                                | (intValues1 >>> 2) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 3) << 6
	                                                | (intValues2 >>> 3) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 7) << 5
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 5) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 & 31) << 3
	                                                | (intValues5 >>> 6) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues5 & 63) << 2
	                                                | (intValues6 >>> 7) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues6 & 127) << 1
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues8 >>> 1) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 & 1) << 7
	                                                | (intValues9 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues9 & 3) << 6
	                                                | (intValues10 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues10 & 7) << 5
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 5) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues12 & 31) << 3
	                                                | (intValues13 >>> 6) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues13 & 63) << 2
	                                                | (intValues14 >>> 7) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues14 & 127) << 1
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues16 >>> 1) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues16 & 1) << 7
	                                                | (intValues17 >>> 2) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues17 & 3) << 6
	                                                | (intValues18 >>> 3) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues18 & 7) << 5
	                                                | (intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 5) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues20 & 31) << 3
	                                                | (intValues21 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues21 & 63) << 2
	                                                | (intValues22 >>> 7) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues22 & 127) << 1
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues24 >>> 1) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues24 & 1) << 7
	                                                | (intValues25 >>> 2) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues25 & 3) << 6
	                                                | (intValues26 >>> 3) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues26 & 7) << 5
	                                                | (intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 5) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues28 & 31) << 3
	                                                | (intValues29 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues29 & 63) << 2
	                                                | (intValues30 >>> 7) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues30 & 127) << 1
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues31 & 0xFF);
	      
	      out[outputOffset + 36] = (byte) ((intValues32 >>> 1) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues32 & 1) << 7
	                                                | (intValues33 >>> 2) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues33 & 3) << 6
	                                                | (intValues34 >>> 3) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues34 & 7) << 5
	                                                | (intValues35 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues35 & 15) << 4
	                                                | (intValues36 >>> 5) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues36 & 31) << 3
	                                                | (intValues37 >>> 6) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues37 & 63) << 2
	                                                | (intValues38 >>> 7) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues38 & 127) << 1
	                                                | (intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues40 >>> 1) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues40 & 1) << 7
	                                                | (intValues41 >>> 2) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues41 & 3) << 6
	                                                | (intValues42 >>> 3) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues42 & 7) << 5
	                                                | (intValues43 >>> 4) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues43 & 15) << 4
	                                                | (intValues44 >>> 5) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues44 & 31) << 3
	                                                | (intValues45 >>> 6) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues45 & 63) << 2
	                                                | (intValues46 >>> 7) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues46 & 127) << 1
	                                                | (intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues48 >>> 1) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues48 & 1) << 7
	                                                | (intValues49 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues49 & 3) << 6
	                                                | (intValues50 >>> 3) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues50 & 7) << 5
	                                                | (intValues51 >>> 4) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues51 & 15) << 4
	                                                | (intValues52 >>> 5) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues52 & 31) << 3
	                                                | (intValues53 >>> 6) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues53 & 63) << 2
	                                                | (intValues54 >>> 7) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues54 & 127) << 1
	                                                | (intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 62] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues56 >>> 1) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues56 & 1) << 7
	                                                | (intValues57 >>> 2) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues57 & 3) << 6
	                                                | (intValues58 >>> 3) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues58 & 7) << 5
	                                                | (intValues59 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues59 & 15) << 4
	                                                | (intValues60 >>> 5) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues60 & 31) << 3
	                                                | (intValues61 >>> 6) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues61 & 63) << 2
	                                                | (intValues62 >>> 7) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues62 & 127) << 1
	                                                | (intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues63 & 0xFF);	      
		inpos.add(64);
		outpos.add(72);
	}
	
	//1 10bit
	protected static void fastpack160(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6);
		inpos.add(1);
		outpos.add(2);
	}
	
	//2 10bits
	protected static void fastpack161(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4);
		inpos.add(2);
		outpos.add(3);
	}
	
	//3 10bits
	protected static void fastpack162(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2);
		inpos.add(3);
		outpos.add(4);
	}
	
	//4 10bits
	protected static void fastpack163(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
		inpos.add(4);
		outpos.add(5);
	}
	
	//5 10bits
	protected static void fastpack164(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6);
		inpos.add(5);
		outpos.add(7);
	}
	
	//6 10bits
	protected static void fastpack165(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4);
		inpos.add(6);
		outpos.add(8);
	}
	
	//7 10bits
	protected static void fastpack166(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2);
		inpos.add(7);
		outpos.add(9);
	}
	
	//8 10bits
	protected static void fastpack167(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(10);
	}
	
	//9 10bits
	protected static void fastpack168(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6);
		inpos.add(9);
		outpos.add(12);
	}
	
	//10 10bits
	protected static void fastpack169(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4);
		inpos.add(10);
		outpos.add(13);
	}
	
	//11 10bits
	protected static void fastpack170(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2);
		inpos.add(11);
		outpos.add(14);
	}
	
	//12 10bits
	protected static void fastpack171(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
		inpos.add(12);
		outpos.add(15);
	}
	
	//14 10bits
	protected static void fastpack172(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues13 & 15) << 4);
		inpos.add(14);
		outpos.add(18);
	}
	
	//16 10bits
	protected static void fastpack173(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(20);
	}
	
	//32 10bits	
	protected static void fastpack174(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues16 >>> 2) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues16 & 3) << 6
	                                                | (intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 6) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues18 & 63) << 2
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues20 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues20 & 3) << 6
	                                                | (intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 6) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues22 & 63) << 2
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues24 >>> 2) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues24 & 3) << 6
	                                                | (intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues26 & 63) << 2
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues28 >>> 2) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues28 & 3) << 6
	                                                | (intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 6) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues30 & 63) << 2
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(40);
	}
	
	//64 10bits
	protected static void fastpack175(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 2) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 3) << 6
	                                                | (intValues1 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 15) << 4
	                                                | (intValues2 >>> 6) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 & 63) << 2
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues4 >>> 2) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 3) << 6
	                                                | (intValues5 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 & 15) << 4
	                                                | (intValues6 >>> 6) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues6 & 63) << 2
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues8 >>> 2) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 & 3) << 6
	                                                | (intValues9 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues9 & 15) << 4
	                                                | (intValues10 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues10 & 63) << 2
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues12 >>> 2) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues12 & 3) << 6
	                                                | (intValues13 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues13 & 15) << 4
	                                                | (intValues14 >>> 6) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues14 & 63) << 2
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues16 >>> 2) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues16 & 3) << 6
	                                                | (intValues17 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues17 & 15) << 4
	                                                | (intValues18 >>> 6) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues18 & 63) << 2
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues20 >>> 2) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues20 & 3) << 6
	                                                | (intValues21 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues21 & 15) << 4
	                                                | (intValues22 >>> 6) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues22 & 63) << 2
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues24 >>> 2) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues24 & 3) << 6
	                                                | (intValues25 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues25 & 15) << 4
	                                                | (intValues26 >>> 6) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues26 & 63) << 2
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues28 >>> 2) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues28 & 3) << 6
	                                                | (intValues29 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues29 & 15) << 4
	                                                | (intValues30 >>> 6) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues30 & 63) << 2
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues31 & 0xFF);
	      
	      out[outputOffset + 40] = (byte) ((intValues32 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues32 & 3) << 6
	                                                | (intValues33 >>> 4) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues33 & 15) << 4
	                                                | (intValues34 >>> 6) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues34 & 63) << 2
	                                                | (intValues35 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues35 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues36 >>> 2) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues36 & 3) << 6
	                                                | (intValues37 >>> 4) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues37 & 15) << 4
	                                                | (intValues38 >>> 6) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues38 & 63) << 2
	                                                | (intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues40 >>> 2) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues40 & 3) << 6
	                                                | (intValues41 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues41 & 15) << 4
	                                                | (intValues42 >>> 6) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues42 & 63) << 2
	                                                | (intValues43 >>> 8) & 0xFF);
	      out[outputOffset + 54] = (byte) (intValues43 & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues44 >>> 2) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues44 & 3) << 6
	                                                | (intValues45 >>> 4) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues45 & 15) << 4
	                                                | (intValues46 >>> 6) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues46 & 63) << 2
	                                                | (intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues48 >>> 2) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues48 & 3) << 6
	                                                | (intValues49 >>> 4) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues49 & 15) << 4
	                                                | (intValues50 >>> 6) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues50 & 63) << 2
	                                                | (intValues51 >>> 8) & 0xFF);
	      out[outputOffset + 64] = (byte) (intValues51 & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues52 >>> 2) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues52 & 3) << 6
	                                                | (intValues53 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues53 & 15) << 4
	                                                | (intValues54 >>> 6) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues54 & 63) << 2
	                                                | (intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 69] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues56 >>> 2) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues56 & 3) << 6
	                                                | (intValues57 >>> 4) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues57 & 15) << 4
	                                                | (intValues58 >>> 6) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues58 & 63) << 2
	                                                | (intValues59 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues59 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues60 >>> 2) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues60 & 3) << 6
	                                                | (intValues61 >>> 4) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues61 & 15) << 4
	                                                | (intValues62 >>> 6) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues62 & 63) << 2
	                                                | (intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues63 & 0xFF);
		inpos.add(64);
		outpos.add(80);
	}
	
	//1 11bits
	protected static void fastpack176(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5);
		inpos.add(1);
		outpos.add(2);
	}
	
	//2 11bits
	protected static void fastpack177(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2);
		inpos.add(2);
		outpos.add(3);
	}
	
	//3 11bits
	protected static void fastpack178(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7);
		inpos.add(3);
		outpos.add(5);
	}
	
	//4 11bits
	protected static void fastpack179(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4);
		inpos.add(4);
		outpos.add(6);
	}
	
	//5 11bits
	protected static void fastpack180(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1);
		inpos.add(5);
		outpos.add(7);
	}
	
	//6 11bits
	protected static void fastpack181(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6);
		inpos.add(6);
		outpos.add(9);
	}
	
	//7 11bits
	protected static void fastpack182(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3);
		inpos.add(7);
		outpos.add(10);
	}
	
	//8 11bits
	protected static void fastpack183(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(11);
	}
	
	//9 11bits
	protected static void fastpack184(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5);
		inpos.add(9);
		outpos.add(13);
	}
	
	//10 11bits
	protected static void fastpack185(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2);
		inpos.add(10);
		outpos.add(14);
	}
	
	//11 11bits
	protected static void fastpack186(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7);
		inpos.add(11);
		outpos.add(16);
	}
	
	//12 11bits
	protected static void fastpack187(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4);
		inpos.add(12);
		outpos.add(17);
	}
	
	//14 11bits
	protected static void fastpack188(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues13 & 3) << 6);
		inpos.add(14);
		outpos.add(20);
	}
	
	//16 11bits
	protected static void fastpack189(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(22);
	}
	
	//32 11bits
	protected static void fastpack190(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues16 >>> 3) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues16 & 7) << 5
	                                                | (intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 9) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues18 >>> 1) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues18 & 1) << 7
	                                                | (intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 7) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues20 & 127) << 1
	                                                | (intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 5) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues22 & 31) << 3
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues24 >>> 3) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues24 & 7) << 5
	                                                | (intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 9) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues26 >>> 1) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues26 & 1) << 7
	                                                | (intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 7) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues28 & 127) << 1
	                                                | (intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 5) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues30 & 31) << 3
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(44);
	}
	
	//64 11bits
	protected static void fastpack191(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 3) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 7) << 5
	                                                | (intValues1 >>> 6) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 & 63) << 2
	                                                | (intValues2 >>> 9) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 1) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 1) << 7
	                                                | (intValues3 >>> 4) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues3 & 15) << 4
	                                                | (intValues4 >>> 7) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 & 127) << 1
	                                                | (intValues5 >>> 10) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues5 >>> 2) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues5 & 3) << 6
	                                                | (intValues6 >>> 5) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 & 31) << 3
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 10] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues8 >>> 3) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 & 7) << 5
	                                                | (intValues9 >>> 6) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues9 & 63) << 2
	                                                | (intValues10 >>> 9) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues10 >>> 1) & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 & 1) << 7
	                                                | (intValues11 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues11 & 15) << 4
	                                                | (intValues12 >>> 7) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues12 & 127) << 1
	                                                | (intValues13 >>> 10) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues13 >>> 2) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues13 & 3) << 6
	                                                | (intValues14 >>> 5) & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues14 & 31) << 3
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues16 >>> 3) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues16 & 7) << 5
	                                                | (intValues17 >>> 6) & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues17 & 63) << 2
	                                                | (intValues18 >>> 9) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues18 >>> 1) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues18 & 1) << 7
	                                                | (intValues19 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues19 & 15) << 4
	                                                | (intValues20 >>> 7) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues20 & 127) << 1
	                                                | (intValues21 >>> 10) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues21 >>> 2) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues21 & 3) << 6
	                                                | (intValues22 >>> 5) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues22 & 31) << 3
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues24 >>> 3) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues24 & 7) << 5
	                                                | (intValues25 >>> 6) & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues25 & 63) << 2
	                                                | (intValues26 >>> 9) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues26 >>> 1) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues26 & 1) << 7
	                                                | (intValues27 >>> 4) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues27 & 15) << 4
	                                                | (intValues28 >>> 7) & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues28 & 127) << 1
	                                                | (intValues29 >>> 10) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues29 >>> 2) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues29 & 3) << 6
	                                                | (intValues30 >>> 5) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues30 & 31) << 3
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues31 & 0xFF);

	      out[outputOffset + 44] = (byte) ((intValues32 >>> 3) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues32 & 7) << 5
	                                                | (intValues33 >>> 6) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues33 & 63) << 2
	                                                | (intValues34 >>> 9) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues34 >>> 1) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues34 & 1) << 7
	                                                | (intValues35 >>> 4) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues35 & 15) << 4
	                                                | (intValues36 >>> 7) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues36 & 127) << 1
	                                                | (intValues37 >>> 10) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues37 >>> 2) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues37 & 3) << 6
	                                                | (intValues38 >>> 5) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues38 & 31) << 3
	                                                | (intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 54] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues40 >>> 3) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues40 & 7) << 5
	                                                | (intValues41 >>> 6) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues41 & 63) << 2
	                                                | (intValues42 >>> 9) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues42 >>> 1) & 0xFF);
	      out[outputOffset + 59] = (byte) ((intValues42 & 1) << 7
	                                                | (intValues43 >>> 4) & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues43 & 15) << 4
	                                                | (intValues44 >>> 7) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues44 & 127) << 1
	                                                | (intValues45 >>> 10) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues45 >>> 2) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues45 & 3) << 6
	                                                | (intValues46 >>> 5) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues46 & 31) << 3
	                                                | (intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 65] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues48 >>> 3) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues48 & 7) << 5
	                                                | (intValues49 >>> 6) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues49 & 63) << 2
	                                                | (intValues50 >>> 9) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues50 >>> 1) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues50 & 1) << 7
	                                                | (intValues51 >>> 4) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues51 & 15) << 4
	                                                | (intValues52 >>> 7) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues52 & 127) << 1
	                                                | (intValues53 >>> 10) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues53 >>> 2) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues53 & 3) << 6
	                                                | (intValues54 >>> 5) & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues54 & 31) << 3
	                                                | (intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 76] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues56 >>> 3) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues56 & 7) << 5
	                                                | (intValues57 >>> 6) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues57 & 63) << 2
	                                                | (intValues58 >>> 9) & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues58 >>> 1) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues58 & 1) << 7
	                                                | (intValues59 >>> 4) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues59 & 15) << 4
	                                                | (intValues60 >>> 7) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues60 & 127) << 1
	                                                | (intValues61 >>> 10) & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues61 >>> 2) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues61 & 3) << 6
	                                                | (intValues62 >>> 5) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues62 & 31) << 3
	                                                | (intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 87] = (byte) (intValues63 & 0xFF);	      
		inpos.add(64);
		outpos.add(88);
	}
	
	//1 12bits
	protected static void fastpack192(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4);
		inpos.add(1);
		outpos.add(2);
	}
	
	//2 12bits
	protected static void fastpack193(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
		inpos.add(2);
		outpos.add(3);
	}
	
	//3 12bits
	protected static void fastpack194(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4);
		inpos.add(3);
		outpos.add(5);
	}
	
	//4 12bits
	protected static void fastpack195(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
		inpos.add(4);
		outpos.add(6);
	}
	
	//5 12bits
	protected static void fastpack196(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4);
		inpos.add(5);
		outpos.add(8);
	}
	
	//6 12bits
	protected static void fastpack197(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
		inpos.add(6);
		outpos.add(9);
	}
	
	//7 12bits
	protected static void fastpack198(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4);

		inpos.add(7);
		outpos.add(11);
	}
	
	//8 12bits
	protected static void fastpack199(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(12);
	}
	
	//9 12bits
	protected static void fastpack200(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4);

		inpos.add(9);
		outpos.add(14);
	}
	
	//10 12bits
	protected static void fastpack201(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
		inpos.add(10);
		outpos.add(15);
	}
	
	//11 12bits
	protected static void fastpack202(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4);
		inpos.add(11);
		outpos.add(17);
	}
	
	//12 12bits
	protected static void fastpack203(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
		inpos.add(12);
		outpos.add(18);
	}
	
	//14 12bits
	protected static void fastpack204(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues13 & 0xFF);
		inpos.add(14);
		outpos.add(21);
	}
	
	//16 12bits
	protected static void fastpack205(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(24);
	}
	
	//32 12bits
	protected static void fastpack206(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(48);
	}
	
	//64 12bits
	protected static void fastpack207(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 2] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 8] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 19] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 20] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 26] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 32] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 38] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 39] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues31 & 0xFF);
	      
	      out[outputOffset + 48] = (byte) ((intValues32 >>> 4) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues32 & 15) << 4
	                                                | (intValues33 >>> 8) & 0xFF);
	      out[outputOffset + 50] = (byte) (intValues33 & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues34 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues34 & 15) << 4
	                                                | (intValues35 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues35 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues36 >>> 4) & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues36 & 15) << 4
	                                                | (intValues37 >>> 8) & 0xFF);
	      out[outputOffset + 56] = (byte) (intValues37 & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues38 >>> 4) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues38 & 15) << 4
	                                                | (intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues40 >>> 4) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues40 & 15) << 4
	                                                | (intValues41 >>> 8) & 0xFF);
	      out[outputOffset + 62] = (byte) (intValues41 & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues42 >>> 4) & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues42 & 15) << 4
	                                                | (intValues43 >>> 8) & 0xFF);
	      out[outputOffset + 65] = (byte) (intValues43 & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues44 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues44 & 15) << 4
	                                                | (intValues45 >>> 8) & 0xFF);
	      out[outputOffset + 68] = (byte) (intValues45 & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues46 >>> 4) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues46 & 15) << 4
	                                                | (intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues48 >>> 4) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues48 & 15) << 4
	                                                | (intValues49 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues49 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues50 >>> 4) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues50 & 15) << 4
	                                                | (intValues51 >>> 8) & 0xFF);
	      out[outputOffset + 77] = (byte) (intValues51 & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues52 >>> 4) & 0xFF);
	      out[outputOffset + 79] = (byte) ((intValues52 & 15) << 4
	                                                | (intValues53 >>> 8) & 0xFF);
	      out[outputOffset + 80] = (byte) (intValues53 & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues54 >>> 4) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues54 & 15) << 4
	                                                | (intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues56 >>> 4) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues56 & 15) << 4
	                                                | (intValues57 >>> 8) & 0xFF);
	      out[outputOffset + 86] = (byte) (intValues57 & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues58 >>> 4) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues58 & 15) << 4
	                                                | (intValues59 >>> 8) & 0xFF);
	      out[outputOffset + 89] = (byte) (intValues59 & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues60 >>> 4) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues60 & 15) << 4
	                                                | (intValues61 >>> 8) & 0xFF);
	      out[outputOffset + 92] = (byte) (intValues61 & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues62 >>> 4) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues62 & 15) << 4
	                                                | (intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 95] = (byte) (intValues63 & 0xFF);	    
		inpos.add(64);
		outpos.add(96);
	}
	
	//1 16bits
	protected static void fastpack208(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
		inpos.add(1);
		outpos.add(2);
	}
	
	//2 16bits
	protected static void fastpack209(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
		inpos.add(2);
		outpos.add(4);
	}
	
	//3 16bits
	protected static void fastpack210(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
		inpos.add(3);
		outpos.add(6);
	}
	
	//4 16bits
	protected static void fastpack211(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
		inpos.add(4);
		outpos.add(8);
	}
	
	//5 16bits
	protected static void fastpack212(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
		inpos.add(5);
		outpos.add(10);
	}
	
	//6 16bits
	protected static void fastpack213(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
		inpos.add(6);
		outpos.add(12);
	}
	
	//7 16bits
	protected static void fastpack214(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
		inpos.add(7);
		outpos.add(14);
	}
	
	//8 16bits
	protected static void fastpack215(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(16);
	}
	
	//9 16bits
	protected static void fastpack216(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
		inpos.add(9);
		outpos.add(18);
	}
	
	//10 16bits
	protected static void fastpack217(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
		inpos.add(10);
		outpos.add(20);
	}
	
	//11 16bits
	protected static void fastpack218(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
		inpos.add(11);
		outpos.add(22);
	}
	
	//12 16bits
	protected static void fastpack219(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
		inpos.add(12);
		outpos.add(24);
	}
	
	//14 16bits
	protected static void fastpack220(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues13 & 0xFF);
		inpos.add(14);
		outpos.add(28);
	}
	
	//16 16bits
	protected static void fastpack221(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(32);
	}
	
	//32 16bits
	protected static void fastpack222(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 33] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 37] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 45] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 57] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 61] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(64);
	}
	
	//64 16bits
	protected static void fastpack223(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 1] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 5] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 13] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 17] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 21] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 25] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 33] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 37] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 41] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 45] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 53] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 57] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 61] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues31 & 0xFF);
	      
	      out[outputOffset + 64] = (byte) ((intValues32 >>> 8) & 0xFF);
	      out[outputOffset + 65] = (byte) (intValues32 & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues33 >>> 8) & 0xFF);
	      out[outputOffset + 67] = (byte) (intValues33 & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues34 >>> 8) & 0xFF);
	      out[outputOffset + 69] = (byte) (intValues34 & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues35 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues35 & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues36 >>> 8) & 0xFF);
	      out[outputOffset + 73] = (byte) (intValues36 & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues37 >>> 8) & 0xFF);
	      out[outputOffset + 75] = (byte) (intValues37 & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues38 >>> 8) & 0xFF);
	      out[outputOffset + 77] = (byte) (intValues38 & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues40 >>> 8) & 0xFF);
	      out[outputOffset + 81] = (byte) (intValues40 & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues41 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues41 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues42 >>> 8) & 0xFF);
	      out[outputOffset + 85] = (byte) (intValues42 & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues43 >>> 8) & 0xFF);
	      out[outputOffset + 87] = (byte) (intValues43 & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues44 >>> 8) & 0xFF);
	      out[outputOffset + 89] = (byte) (intValues44 & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues45 >>> 8) & 0xFF);
	      out[outputOffset + 91] = (byte) (intValues45 & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues46 >>> 8) & 0xFF);
	      out[outputOffset + 93] = (byte) (intValues46 & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 95] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues48 >>> 8) & 0xFF);
	      out[outputOffset + 97] = (byte) (intValues48 & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues49 >>> 8) & 0xFF);
	      out[outputOffset + 99] = (byte) (intValues49 & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues50 >>> 8) & 0xFF);
	      out[outputOffset + 101] = (byte) (intValues50 & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues51 >>> 8) & 0xFF);
	      out[outputOffset + 103] = (byte) (intValues51 & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues52 >>> 8) & 0xFF);
	      out[outputOffset + 105] = (byte) (intValues52 & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues53 >>> 8) & 0xFF);
	      out[outputOffset + 107] = (byte) (intValues53 & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues54 >>> 8) & 0xFF);
	      out[outputOffset + 109] = (byte) (intValues54 & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 111] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues56 >>> 8) & 0xFF);
	      out[outputOffset + 113] = (byte) (intValues56 & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues57 >>> 8) & 0xFF);
	      out[outputOffset + 115] = (byte) (intValues57 & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues58 >>> 8) & 0xFF);
	      out[outputOffset + 117] = (byte) (intValues58 & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues59 >>> 8) & 0xFF);
	      out[outputOffset + 119] = (byte) (intValues59 & 0xFF);
	      out[outputOffset + 120] = (byte) ((intValues60 >>> 8) & 0xFF);
	      out[outputOffset + 121] = (byte) (intValues60 & 0xFF);
	      out[outputOffset + 122] = (byte) ((intValues61 >>> 8) & 0xFF);
	      out[outputOffset + 123] = (byte) (intValues61 & 0xFF);
	      out[outputOffset + 124] = (byte) ((intValues62 >>> 8) & 0xFF);
	      out[outputOffset + 125] = (byte) (intValues62 & 0xFF);
	      out[outputOffset + 126] = (byte) ((intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 127] = (byte) (intValues63 & 0xFF);	    
		inpos.add(64);
		outpos.add(128);
	}
	
	//1 20bits
	protected static void fastpack224(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4 & 0xFF);
		inpos.add(1);
		outpos.add(3);
	}
	
	//2 20bits
	protected static void fastpack225(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
		inpos.add(2);
		outpos.add(5);
	}
	
	//3 20bits
	protected static void fastpack226(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4 & 0xFF);
		inpos.add(3);
		outpos.add(8);
	}
	
	//4 20bits
	protected static void fastpack227(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
		inpos.add(4);
		outpos.add(10);
	}
	
	//5 20bits
	protected static void fastpack228(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4 & 0xFF);
		inpos.add(5);
		outpos.add(13);
	}
	
	//6 20bits
	protected static void fastpack229(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
		inpos.add(6);
		outpos.add(15);
	}
	
	//7 20bits
	protected static void fastpack230(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4 & 0xFF);
		inpos.add(7);
		outpos.add(18);
	}
	
	//8 20bits
	protected static void fastpack231(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(20);
	}
	
	//9 20bits
	protected static void fastpack232(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4 & 0xFF);
		inpos.add(9);
		outpos.add(23);
	}
	
	//10 20bits
	protected static void fastpack233(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
		inpos.add(10);
		outpos.add(25);
	}
	
	//11 20bits
	protected static void fastpack234(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4 & 0xFF);
		inpos.add(11);
		outpos.add(28);
	}
	
	//12 20bits
	protected static void fastpack235(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
		inpos.add(12);
		outpos.add(30);
	}
	
	//14 20bits
	protected static void fastpack236(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues13 & 0xFF);
		inpos.add(14);
		outpos.add(35);
	}
	
	//16 20bits
	protected static void fastpack237(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(40);
	}
	
	//32 20bits
	protected static void fastpack238(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues16 >>> 12) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues18 >>> 12) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues20 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 54] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues22 >>> 12) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues24 >>> 12) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 64] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues26 >>> 12) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 69] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues28 >>> 12) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues30 >>> 12) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(80);
	}
	
	//64 20bits
	protected static void fastpack239(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 12) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 4) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 & 15) << 4
	                                                | (intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 3] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 4] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues2 >>> 12) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues2 >>> 4) & 0xFF);
	      out[outputOffset + 7] = (byte) ((intValues2 & 15) << 4
	                                                | (intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 9] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues4 >>> 12) & 0xFF);
	      out[outputOffset + 11] = (byte) ((intValues4 >>> 4) & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues4 & 15) << 4
	                                                | (intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 14] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 15] = (byte) ((intValues6 >>> 12) & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues6 >>> 4) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues6 & 15) << 4
	                                                | (intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues8 >>> 12) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues8 >>> 4) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues8 & 15) << 4
	                                                | (intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 23] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 24] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues10 >>> 12) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues10 >>> 4) & 0xFF);
	      out[outputOffset + 27] = (byte) ((intValues10 & 15) << 4
	                                                | (intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 29] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues12 >>> 12) & 0xFF);
	      out[outputOffset + 31] = (byte) ((intValues12 >>> 4) & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues12 & 15) << 4
	                                                | (intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 34] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 35] = (byte) ((intValues14 >>> 12) & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues14 >>> 4) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues14 & 15) << 4
	                                                | (intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues16 >>> 12) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues16 >>> 4) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues16 & 15) << 4
	                                                | (intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 43] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 44] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues18 >>> 12) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues18 >>> 4) & 0xFF);
	      out[outputOffset + 47] = (byte) ((intValues18 & 15) << 4
	                                                | (intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 49] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues20 >>> 12) & 0xFF);
	      out[outputOffset + 51] = (byte) ((intValues20 >>> 4) & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues20 & 15) << 4
	                                                | (intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 54] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 55] = (byte) ((intValues22 >>> 12) & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues22 >>> 4) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues22 & 15) << 4
	                                                | (intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues24 >>> 12) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues24 >>> 4) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues24 & 15) << 4
	                                                | (intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 63] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 64] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues26 >>> 12) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues26 >>> 4) & 0xFF);
	      out[outputOffset + 67] = (byte) ((intValues26 & 15) << 4
	                                                | (intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 69] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues28 >>> 12) & 0xFF);
	      out[outputOffset + 71] = (byte) ((intValues28 >>> 4) & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues28 & 15) << 4
	                                                | (intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 74] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 75] = (byte) ((intValues30 >>> 12) & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues30 >>> 4) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues30 & 15) << 4
	                                                | (intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues31 & 0xFF);
	
	      out[outputOffset + 80] = (byte) ((intValues32 >>> 12) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues32 >>> 4) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues32 & 15) << 4
	                                                | (intValues33 >>> 16) & 0xFF);
	      out[outputOffset + 83] = (byte) ((intValues33 >>> 8) & 0xFF);
	      out[outputOffset + 84] = (byte) (intValues33 & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues34 >>> 12) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues34 >>> 4) & 0xFF);
	      out[outputOffset + 87] = (byte) ((intValues34 & 15) << 4
	                                                | (intValues35 >>> 16) & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues35 >>> 8) & 0xFF);
	      out[outputOffset + 89] = (byte) (intValues35 & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues36 >>> 12) & 0xFF);
	      out[outputOffset + 91] = (byte) ((intValues36 >>> 4) & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues36 & 15) << 4
	                                                | (intValues37 >>> 16) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues37 >>> 8) & 0xFF);
	      out[outputOffset + 94] = (byte) (intValues37 & 0xFF);
	      out[outputOffset + 95] = (byte) ((intValues38 >>> 12) & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues38 >>> 4) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues38 & 15) << 4
	                                                | (intValues39 >>> 16) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 99] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues40 >>> 12) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues40 >>> 4) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues40 & 15) << 4
	                                                | (intValues41 >>> 16) & 0xFF);
	      out[outputOffset + 103] = (byte) ((intValues41 >>> 8) & 0xFF);
	      out[outputOffset + 104] = (byte) (intValues41 & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues42 >>> 12) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues42 >>> 4) & 0xFF);
	      out[outputOffset + 107] = (byte) ((intValues42 & 15) << 4
	                                                | (intValues43 >>> 16) & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues43 >>> 8) & 0xFF);
	      out[outputOffset + 109] = (byte) (intValues43 & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues44 >>> 12) & 0xFF);
	      out[outputOffset + 111] = (byte) ((intValues44 >>> 4) & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues44 & 15) << 4
	                                                | (intValues45 >>> 16) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues45 >>> 8) & 0xFF);
	      out[outputOffset + 114] = (byte) (intValues45 & 0xFF);
	      out[outputOffset + 115] = (byte) ((intValues46 >>> 12) & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues46 >>> 4) & 0xFF);
	      out[outputOffset + 117] = (byte) ((intValues46 & 15) << 4
	                                                | (intValues47 >>> 16) & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 119] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 120] = (byte) ((intValues48 >>> 12) & 0xFF);
	      out[outputOffset + 121] = (byte) ((intValues48 >>> 4) & 0xFF);
	      out[outputOffset + 122] = (byte) ((intValues48 & 15) << 4
	                                                | (intValues49 >>> 16) & 0xFF);
	      out[outputOffset + 123] = (byte) ((intValues49 >>> 8) & 0xFF);
	      out[outputOffset + 124] = (byte) (intValues49 & 0xFF);
	      out[outputOffset + 125] = (byte) ((intValues50 >>> 12) & 0xFF);
	      out[outputOffset + 126] = (byte) ((intValues50 >>> 4) & 0xFF);
	      out[outputOffset + 127] = (byte) ((intValues50 & 15) << 4
	                                                | (intValues51 >>> 16) & 0xFF);
	      out[outputOffset + 128] = (byte) ((intValues51 >>> 8) & 0xFF);
	      out[outputOffset + 129] = (byte) (intValues51 & 0xFF);
	      out[outputOffset + 130] = (byte) ((intValues52 >>> 12) & 0xFF);
	      out[outputOffset + 131] = (byte) ((intValues52 >>> 4) & 0xFF);
	      out[outputOffset + 132] = (byte) ((intValues52 & 15) << 4
	                                                | (intValues53 >>> 16) & 0xFF);
	      out[outputOffset + 133] = (byte) ((intValues53 >>> 8) & 0xFF);
	      out[outputOffset + 134] = (byte) (intValues53 & 0xFF);
	      out[outputOffset + 135] = (byte) ((intValues54 >>> 12) & 0xFF);
	      out[outputOffset + 136] = (byte) ((intValues54 >>> 4) & 0xFF);
	      out[outputOffset + 137] = (byte) ((intValues54 & 15) << 4
	                                                | (intValues55 >>> 16) & 0xFF);
	      out[outputOffset + 138] = (byte) ((intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 139] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 140] = (byte) ((intValues56 >>> 12) & 0xFF);
	      out[outputOffset + 141] = (byte) ((intValues56 >>> 4) & 0xFF);
	      out[outputOffset + 142] = (byte) ((intValues56 & 15) << 4
	                                                | (intValues57 >>> 16) & 0xFF);
	      out[outputOffset + 143] = (byte) ((intValues57 >>> 8) & 0xFF);
	      out[outputOffset + 144] = (byte) (intValues57 & 0xFF);
	      out[outputOffset + 145] = (byte) ((intValues58 >>> 12) & 0xFF);
	      out[outputOffset + 146] = (byte) ((intValues58 >>> 4) & 0xFF);
	      out[outputOffset + 147] = (byte) ((intValues58 & 15) << 4
	                                                | (intValues59 >>> 16) & 0xFF);
	      out[outputOffset + 148] = (byte) ((intValues59 >>> 8) & 0xFF);
	      out[outputOffset + 149] = (byte) (intValues59 & 0xFF);
	      out[outputOffset + 150] = (byte) ((intValues60 >>> 12) & 0xFF);
	      out[outputOffset + 151] = (byte) ((intValues60 >>> 4) & 0xFF);
	      out[outputOffset + 152] = (byte) ((intValues60 & 15) << 4
	                                                | (intValues61 >>> 16) & 0xFF);
	      out[outputOffset + 153] = (byte) ((intValues61 >>> 8) & 0xFF);
	      out[outputOffset + 154] = (byte) (intValues61 & 0xFF);
	      out[outputOffset + 155] = (byte) ((intValues62 >>> 12) & 0xFF);
	      out[outputOffset + 156] = (byte) ((intValues62 >>> 4) & 0xFF);
	      out[outputOffset + 157] = (byte) ((intValues62 & 15) << 4
	                                                | (intValues63 >>> 16) & 0xFF);
	      out[outputOffset + 158] = (byte) ((intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 159] = (byte) (intValues63 & 0xFF);	      
		inpos.add(64);
		outpos.add(160);
	}
	
	//1 32bits
	protected static void fastpack240(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
		inpos.add(1);
		outpos.add(4);
	}
	
	//2 32bits
	protected static void fastpack241(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
		inpos.add(2);
		outpos.add(8);
	}
	
	//3 32bits
	protected static void fastpack242(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
		inpos.add(3);
		outpos.add(12);
	}
	
	//4 32bits
	protected static void fastpack243(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
		inpos.add(4);
		outpos.add(16);
	}
	
	//5 32bits
	protected static void fastpack244(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
		inpos.add(5);
		outpos.add(20);
	}
	
	//6 32bits
	protected static void fastpack245(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
		inpos.add(6);
		outpos.add(24);
	}
	
	//7 32bits
	protected static void fastpack246(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
		inpos.add(7);
		outpos.add(28);
	}
	
	//8 32bits
	protected static void fastpack247(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
		inpos.add(8);
		outpos.add(32);
	}
	
	//9 32bits
	protected static void fastpack248(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
		inpos.add(9);
		outpos.add(36);
	}
	
	//10 32bits
	protected static void fastpack249(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
		inpos.add(10);
		outpos.add(40);
	}
	
	//11 32bits
	protected static void fastpack250(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
		inpos.add(11);
		outpos.add(44);
	}
	
	//12 32bits
	protected static void fastpack251(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
		inpos.add(12);
		outpos.add(48);
	}
	
	//14 32bits
	protected static void fastpack252(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues13 & 0xFF);
		inpos.add(14);
		outpos.add(56);
	}
	
	//16 32bits
	protected static void fastpack253(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues15 & 0xFF);
		inpos.add(16);
		outpos.add(64);
	}
	
	//32 32bits
	protected static void fastpack254(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
	      final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues16 >>> 24) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues16 >>> 16) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 67] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues17 >>> 24) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues18 >>> 24) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues18 >>> 16) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 75] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues19 >>> 24) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues20 >>> 24) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues20 >>> 16) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues21 >>> 24) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 87] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues22 >>> 24) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues22 >>> 16) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 91] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 95] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues24 >>> 24) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues24 >>> 16) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 99] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues25 >>> 24) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 103] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues26 >>> 24) & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues26 >>> 16) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 107] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues27 >>> 24) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 111] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues28 >>> 24) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues28 >>> 16) & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 115] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues29 >>> 24) & 0xFF);
	      out[outputOffset + 117] = (byte) ((intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 119] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 120] = (byte) ((intValues30 >>> 24) & 0xFF);
	      out[outputOffset + 121] = (byte) ((intValues30 >>> 16) & 0xFF);
	      out[outputOffset + 122] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 123] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 124] = (byte) ((intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 125] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 126] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 127] = (byte) (intValues31 & 0xFF);
		inpos.add(32);
		outpos.add(128);
	}
	
	//64 32bits
	protected static void fastpack255(final int[] in, IntWrapper inpos, final byte[] out, IntWrapper outpos) {
		final int outputOffset = outpos.get();
		final int offset = inpos.get();
		  final int intValues0 = in[offset + 0], intValues1 = in[offset + 1];
	      final int intValues2 = in[offset + 2], intValues3 = in[offset + 3];
	      final int intValues4 = in[offset + 4], intValues5 = in[offset + 5];
	      final int intValues6 = in[offset + 6], intValues7 = in[offset + 7];
	      final int intValues8 = in[offset + 8], intValues9 = in[offset + 9];
	      final int intValues10 = in[offset + 10], intValues11 = in[offset + 11];
	      final int intValues12 = in[offset + 12], intValues13 = in[offset + 13];
	      final int intValues14 = in[offset + 14], intValues15 = in[offset + 15];
	      final int intValues16 = in[offset + 16], intValues17 = in[offset + 17];
	      final int intValues18 = in[offset + 18], intValues19 = in[offset + 19];
	      final int intValues20 = in[offset + 20], intValues21 = in[offset + 21];
	      final int intValues22 = in[offset + 22], intValues23 = in[offset + 23];
	      final int intValues24 = in[offset + 24], intValues25 = in[offset + 25];
	      final int intValues26 = in[offset + 26], intValues27 = in[offset + 27];
	      final int intValues28 = in[offset + 28], intValues29 = in[offset + 29];
	      final int intValues30 = in[offset + 30], intValues31 = in[offset + 31];
	      final int intValues32 = in[offset + 32], intValues33 = in[offset + 33];
	      final int intValues34 = in[offset + 34], intValues35 = in[offset + 35];
	      final int intValues36 = in[offset + 36], intValues37 = in[offset + 37];
	      final int intValues38 = in[offset + 38], intValues39 = in[offset + 39];
	      final int intValues40 = in[offset + 40], intValues41 = in[offset + 41];
	      final int intValues42 = in[offset + 42], intValues43 = in[offset + 43];
	      final int intValues44 = in[offset + 44], intValues45 = in[offset + 45];
	      final int intValues46 = in[offset + 46], intValues47 = in[offset + 47];
	      final int intValues48 = in[offset + 48], intValues49 = in[offset + 49];
	      final int intValues50 = in[offset + 50], intValues51 = in[offset + 51];
	      final int intValues52 = in[offset + 52], intValues53 = in[offset + 53];
	      final int intValues54 = in[offset + 54], intValues55 = in[offset + 55];
	      final int intValues56 = in[offset + 56], intValues57 = in[offset + 57];
	      final int intValues58 = in[offset + 58], intValues59 = in[offset + 59];
	      final int intValues60 = in[offset + 60], intValues61 = in[offset + 61];
	      final int intValues62 = in[offset + 62], intValues63 = in[offset + 63];

	      out[outputOffset + 0] = (byte) ((intValues0 >>> 24) & 0xFF);
	      out[outputOffset + 1] = (byte) ((intValues0 >>> 16) & 0xFF);
	      out[outputOffset + 2] = (byte) ((intValues0 >>> 8) & 0xFF);
	      out[outputOffset + 3] = (byte) (intValues0 & 0xFF);
	      out[outputOffset + 4] = (byte) ((intValues1 >>> 24) & 0xFF);
	      out[outputOffset + 5] = (byte) ((intValues1 >>> 16) & 0xFF);
	      out[outputOffset + 6] = (byte) ((intValues1 >>> 8) & 0xFF);
	      out[outputOffset + 7] = (byte) (intValues1 & 0xFF);
	      out[outputOffset + 8] = (byte) ((intValues2 >>> 24) & 0xFF);
	      out[outputOffset + 9] = (byte) ((intValues2 >>> 16) & 0xFF);
	      out[outputOffset + 10] = (byte) ((intValues2 >>> 8) & 0xFF);
	      out[outputOffset + 11] = (byte) (intValues2 & 0xFF);
	      out[outputOffset + 12] = (byte) ((intValues3 >>> 24) & 0xFF);
	      out[outputOffset + 13] = (byte) ((intValues3 >>> 16) & 0xFF);
	      out[outputOffset + 14] = (byte) ((intValues3 >>> 8) & 0xFF);
	      out[outputOffset + 15] = (byte) (intValues3 & 0xFF);
	      out[outputOffset + 16] = (byte) ((intValues4 >>> 24) & 0xFF);
	      out[outputOffset + 17] = (byte) ((intValues4 >>> 16) & 0xFF);
	      out[outputOffset + 18] = (byte) ((intValues4 >>> 8) & 0xFF);
	      out[outputOffset + 19] = (byte) (intValues4 & 0xFF);
	      out[outputOffset + 20] = (byte) ((intValues5 >>> 24) & 0xFF);
	      out[outputOffset + 21] = (byte) ((intValues5 >>> 16) & 0xFF);
	      out[outputOffset + 22] = (byte) ((intValues5 >>> 8) & 0xFF);
	      out[outputOffset + 23] = (byte) (intValues5 & 0xFF);
	      out[outputOffset + 24] = (byte) ((intValues6 >>> 24) & 0xFF);
	      out[outputOffset + 25] = (byte) ((intValues6 >>> 16) & 0xFF);
	      out[outputOffset + 26] = (byte) ((intValues6 >>> 8) & 0xFF);
	      out[outputOffset + 27] = (byte) (intValues6 & 0xFF);
	      out[outputOffset + 28] = (byte) ((intValues7 >>> 24) & 0xFF);
	      out[outputOffset + 29] = (byte) ((intValues7 >>> 16) & 0xFF);
	      out[outputOffset + 30] = (byte) ((intValues7 >>> 8) & 0xFF);
	      out[outputOffset + 31] = (byte) (intValues7 & 0xFF);
	      out[outputOffset + 32] = (byte) ((intValues8 >>> 24) & 0xFF);
	      out[outputOffset + 33] = (byte) ((intValues8 >>> 16) & 0xFF);
	      out[outputOffset + 34] = (byte) ((intValues8 >>> 8) & 0xFF);
	      out[outputOffset + 35] = (byte) (intValues8 & 0xFF);
	      out[outputOffset + 36] = (byte) ((intValues9 >>> 24) & 0xFF);
	      out[outputOffset + 37] = (byte) ((intValues9 >>> 16) & 0xFF);
	      out[outputOffset + 38] = (byte) ((intValues9 >>> 8) & 0xFF);
	      out[outputOffset + 39] = (byte) (intValues9 & 0xFF);
	      out[outputOffset + 40] = (byte) ((intValues10 >>> 24) & 0xFF);
	      out[outputOffset + 41] = (byte) ((intValues10 >>> 16) & 0xFF);
	      out[outputOffset + 42] = (byte) ((intValues10 >>> 8) & 0xFF);
	      out[outputOffset + 43] = (byte) (intValues10 & 0xFF);
	      out[outputOffset + 44] = (byte) ((intValues11 >>> 24) & 0xFF);
	      out[outputOffset + 45] = (byte) ((intValues11 >>> 16) & 0xFF);
	      out[outputOffset + 46] = (byte) ((intValues11 >>> 8) & 0xFF);
	      out[outputOffset + 47] = (byte) (intValues11 & 0xFF);
	      out[outputOffset + 48] = (byte) ((intValues12 >>> 24) & 0xFF);
	      out[outputOffset + 49] = (byte) ((intValues12 >>> 16) & 0xFF);
	      out[outputOffset + 50] = (byte) ((intValues12 >>> 8) & 0xFF);
	      out[outputOffset + 51] = (byte) (intValues12 & 0xFF);
	      out[outputOffset + 52] = (byte) ((intValues13 >>> 24) & 0xFF);
	      out[outputOffset + 53] = (byte) ((intValues13 >>> 16) & 0xFF);
	      out[outputOffset + 54] = (byte) ((intValues13 >>> 8) & 0xFF);
	      out[outputOffset + 55] = (byte) (intValues13 & 0xFF);
	      out[outputOffset + 56] = (byte) ((intValues14 >>> 24) & 0xFF);
	      out[outputOffset + 57] = (byte) ((intValues14 >>> 16) & 0xFF);
	      out[outputOffset + 58] = (byte) ((intValues14 >>> 8) & 0xFF);
	      out[outputOffset + 59] = (byte) (intValues14 & 0xFF);
	      out[outputOffset + 60] = (byte) ((intValues15 >>> 24) & 0xFF);
	      out[outputOffset + 61] = (byte) ((intValues15 >>> 16) & 0xFF);
	      out[outputOffset + 62] = (byte) ((intValues15 >>> 8) & 0xFF);
	      out[outputOffset + 63] = (byte) (intValues15 & 0xFF);
	      out[outputOffset + 64] = (byte) ((intValues16 >>> 24) & 0xFF);
	      out[outputOffset + 65] = (byte) ((intValues16 >>> 16) & 0xFF);
	      out[outputOffset + 66] = (byte) ((intValues16 >>> 8) & 0xFF);
	      out[outputOffset + 67] = (byte) (intValues16 & 0xFF);
	      out[outputOffset + 68] = (byte) ((intValues17 >>> 24) & 0xFF);
	      out[outputOffset + 69] = (byte) ((intValues17 >>> 16) & 0xFF);
	      out[outputOffset + 70] = (byte) ((intValues17 >>> 8) & 0xFF);
	      out[outputOffset + 71] = (byte) (intValues17 & 0xFF);
	      out[outputOffset + 72] = (byte) ((intValues18 >>> 24) & 0xFF);
	      out[outputOffset + 73] = (byte) ((intValues18 >>> 16) & 0xFF);
	      out[outputOffset + 74] = (byte) ((intValues18 >>> 8) & 0xFF);
	      out[outputOffset + 75] = (byte) (intValues18 & 0xFF);
	      out[outputOffset + 76] = (byte) ((intValues19 >>> 24) & 0xFF);
	      out[outputOffset + 77] = (byte) ((intValues19 >>> 16) & 0xFF);
	      out[outputOffset + 78] = (byte) ((intValues19 >>> 8) & 0xFF);
	      out[outputOffset + 79] = (byte) (intValues19 & 0xFF);
	      out[outputOffset + 80] = (byte) ((intValues20 >>> 24) & 0xFF);
	      out[outputOffset + 81] = (byte) ((intValues20 >>> 16) & 0xFF);
	      out[outputOffset + 82] = (byte) ((intValues20 >>> 8) & 0xFF);
	      out[outputOffset + 83] = (byte) (intValues20 & 0xFF);
	      out[outputOffset + 84] = (byte) ((intValues21 >>> 24) & 0xFF);
	      out[outputOffset + 85] = (byte) ((intValues21 >>> 16) & 0xFF);
	      out[outputOffset + 86] = (byte) ((intValues21 >>> 8) & 0xFF);
	      out[outputOffset + 87] = (byte) (intValues21 & 0xFF);
	      out[outputOffset + 88] = (byte) ((intValues22 >>> 24) & 0xFF);
	      out[outputOffset + 89] = (byte) ((intValues22 >>> 16) & 0xFF);
	      out[outputOffset + 90] = (byte) ((intValues22 >>> 8) & 0xFF);
	      out[outputOffset + 91] = (byte) (intValues22 & 0xFF);
	      out[outputOffset + 92] = (byte) ((intValues23 >>> 24) & 0xFF);
	      out[outputOffset + 93] = (byte) ((intValues23 >>> 16) & 0xFF);
	      out[outputOffset + 94] = (byte) ((intValues23 >>> 8) & 0xFF);
	      out[outputOffset + 95] = (byte) (intValues23 & 0xFF);
	      out[outputOffset + 96] = (byte) ((intValues24 >>> 24) & 0xFF);
	      out[outputOffset + 97] = (byte) ((intValues24 >>> 16) & 0xFF);
	      out[outputOffset + 98] = (byte) ((intValues24 >>> 8) & 0xFF);
	      out[outputOffset + 99] = (byte) (intValues24 & 0xFF);
	      out[outputOffset + 100] = (byte) ((intValues25 >>> 24) & 0xFF);
	      out[outputOffset + 101] = (byte) ((intValues25 >>> 16) & 0xFF);
	      out[outputOffset + 102] = (byte) ((intValues25 >>> 8) & 0xFF);
	      out[outputOffset + 103] = (byte) (intValues25 & 0xFF);
	      out[outputOffset + 104] = (byte) ((intValues26 >>> 24) & 0xFF);
	      out[outputOffset + 105] = (byte) ((intValues26 >>> 16) & 0xFF);
	      out[outputOffset + 106] = (byte) ((intValues26 >>> 8) & 0xFF);
	      out[outputOffset + 107] = (byte) (intValues26 & 0xFF);
	      out[outputOffset + 108] = (byte) ((intValues27 >>> 24) & 0xFF);
	      out[outputOffset + 109] = (byte) ((intValues27 >>> 16) & 0xFF);
	      out[outputOffset + 110] = (byte) ((intValues27 >>> 8) & 0xFF);
	      out[outputOffset + 111] = (byte) (intValues27 & 0xFF);
	      out[outputOffset + 112] = (byte) ((intValues28 >>> 24) & 0xFF);
	      out[outputOffset + 113] = (byte) ((intValues28 >>> 16) & 0xFF);
	      out[outputOffset + 114] = (byte) ((intValues28 >>> 8) & 0xFF);
	      out[outputOffset + 115] = (byte) (intValues28 & 0xFF);
	      out[outputOffset + 116] = (byte) ((intValues29 >>> 24) & 0xFF);
	      out[outputOffset + 117] = (byte) ((intValues29 >>> 16) & 0xFF);
	      out[outputOffset + 118] = (byte) ((intValues29 >>> 8) & 0xFF);
	      out[outputOffset + 119] = (byte) (intValues29 & 0xFF);
	      out[outputOffset + 120] = (byte) ((intValues30 >>> 24) & 0xFF);
	      out[outputOffset + 121] = (byte) ((intValues30 >>> 16) & 0xFF);
	      out[outputOffset + 122] = (byte) ((intValues30 >>> 8) & 0xFF);
	      out[outputOffset + 123] = (byte) (intValues30 & 0xFF);
	      out[outputOffset + 124] = (byte) ((intValues31 >>> 24) & 0xFF);
	      out[outputOffset + 125] = (byte) ((intValues31 >>> 16) & 0xFF);
	      out[outputOffset + 126] = (byte) ((intValues31 >>> 8) & 0xFF);
	      out[outputOffset + 127] = (byte) (intValues31 & 0xFF);
	      
	      out[outputOffset + 128] = (byte) ((intValues32 >>> 24) & 0xFF);
	      out[outputOffset + 129] = (byte) ((intValues32 >>> 16) & 0xFF);
	      out[outputOffset + 130] = (byte) ((intValues32 >>> 8) & 0xFF);
	      out[outputOffset + 131] = (byte) (intValues32 & 0xFF);
	      out[outputOffset + 132] = (byte) ((intValues33 >>> 24) & 0xFF);
	      out[outputOffset + 133] = (byte) ((intValues33 >>> 16) & 0xFF);
	      out[outputOffset + 134] = (byte) ((intValues33 >>> 8) & 0xFF);
	      out[outputOffset + 135] = (byte) (intValues33 & 0xFF);
	      out[outputOffset + 136] = (byte) ((intValues34 >>> 24) & 0xFF);
	      out[outputOffset + 137] = (byte) ((intValues34 >>> 16) & 0xFF);
	      out[outputOffset + 138] = (byte) ((intValues34 >>> 8) & 0xFF);
	      out[outputOffset + 139] = (byte) (intValues34 & 0xFF);
	      out[outputOffset + 140] = (byte) ((intValues35 >>> 24) & 0xFF);
	      out[outputOffset + 141] = (byte) ((intValues35 >>> 16) & 0xFF);
	      out[outputOffset + 142] = (byte) ((intValues35 >>> 8) & 0xFF);
	      out[outputOffset + 143] = (byte) (intValues35 & 0xFF);
	      out[outputOffset + 144] = (byte) ((intValues36 >>> 24) & 0xFF);
	      out[outputOffset + 145] = (byte) ((intValues36 >>> 16) & 0xFF);
	      out[outputOffset + 146] = (byte) ((intValues36 >>> 8) & 0xFF);
	      out[outputOffset + 147] = (byte) (intValues36 & 0xFF);
	      out[outputOffset + 148] = (byte) ((intValues37 >>> 24) & 0xFF);
	      out[outputOffset + 149] = (byte) ((intValues37 >>> 16) & 0xFF);
	      out[outputOffset + 150] = (byte) ((intValues37 >>> 8) & 0xFF);
	      out[outputOffset + 151] = (byte) (intValues37 & 0xFF);
	      out[outputOffset + 152] = (byte) ((intValues38 >>> 24) & 0xFF);
	      out[outputOffset + 153] = (byte) ((intValues38 >>> 16) & 0xFF);
	      out[outputOffset + 154] = (byte) ((intValues38 >>> 8) & 0xFF);
	      out[outputOffset + 155] = (byte) (intValues38 & 0xFF);
	      out[outputOffset + 156] = (byte) ((intValues39 >>> 24) & 0xFF);
	      out[outputOffset + 157] = (byte) ((intValues39 >>> 16) & 0xFF);
	      out[outputOffset + 158] = (byte) ((intValues39 >>> 8) & 0xFF);
	      out[outputOffset + 159] = (byte) (intValues39 & 0xFF);
	      out[outputOffset + 160] = (byte) ((intValues40 >>> 24) & 0xFF);
	      out[outputOffset + 161] = (byte) ((intValues40 >>> 16) & 0xFF);
	      out[outputOffset + 162] = (byte) ((intValues40 >>> 8) & 0xFF);
	      out[outputOffset + 163] = (byte) (intValues40 & 0xFF);
	      out[outputOffset + 164] = (byte) ((intValues41 >>> 24) & 0xFF);
	      out[outputOffset + 165] = (byte) ((intValues41 >>> 16) & 0xFF);
	      out[outputOffset + 166] = (byte) ((intValues41 >>> 8) & 0xFF);
	      out[outputOffset + 167] = (byte) (intValues41 & 0xFF);
	      out[outputOffset + 168] = (byte) ((intValues42 >>> 24) & 0xFF);
	      out[outputOffset + 169] = (byte) ((intValues42 >>> 16) & 0xFF);
	      out[outputOffset + 170] = (byte) ((intValues42 >>> 8) & 0xFF);
	      out[outputOffset + 171] = (byte) (intValues42 & 0xFF);
	      out[outputOffset + 172] = (byte) ((intValues43 >>> 24) & 0xFF);
	      out[outputOffset + 173] = (byte) ((intValues43 >>> 16) & 0xFF);
	      out[outputOffset + 174] = (byte) ((intValues43 >>> 8) & 0xFF);
	      out[outputOffset + 175] = (byte) (intValues43 & 0xFF);
	      out[outputOffset + 176] = (byte) ((intValues44 >>> 24) & 0xFF);
	      out[outputOffset + 177] = (byte) ((intValues44 >>> 16) & 0xFF);
	      out[outputOffset + 178] = (byte) ((intValues44 >>> 8) & 0xFF);
	      out[outputOffset + 179] = (byte) (intValues44 & 0xFF);
	      out[outputOffset + 180] = (byte) ((intValues45 >>> 24) & 0xFF);
	      out[outputOffset + 181] = (byte) ((intValues45 >>> 16) & 0xFF);
	      out[outputOffset + 182] = (byte) ((intValues45 >>> 8) & 0xFF);
	      out[outputOffset + 183] = (byte) (intValues45 & 0xFF);
	      out[outputOffset + 184] = (byte) ((intValues46 >>> 24) & 0xFF);
	      out[outputOffset + 185] = (byte) ((intValues46 >>> 16) & 0xFF);
	      out[outputOffset + 186] = (byte) ((intValues46 >>> 8) & 0xFF);
	      out[outputOffset + 187] = (byte) (intValues46 & 0xFF);
	      out[outputOffset + 188] = (byte) ((intValues47 >>> 24) & 0xFF);
	      out[outputOffset + 189] = (byte) ((intValues47 >>> 16) & 0xFF);
	      out[outputOffset + 190] = (byte) ((intValues47 >>> 8) & 0xFF);
	      out[outputOffset + 191] = (byte) (intValues47 & 0xFF);
	      out[outputOffset + 192] = (byte) ((intValues48 >>> 24) & 0xFF);
	      out[outputOffset + 193] = (byte) ((intValues48 >>> 16) & 0xFF);
	      out[outputOffset + 194] = (byte) ((intValues48 >>> 8) & 0xFF);
	      out[outputOffset + 195] = (byte) (intValues48 & 0xFF);
	      out[outputOffset + 196] = (byte) ((intValues49 >>> 24) & 0xFF);
	      out[outputOffset + 197] = (byte) ((intValues49 >>> 16) & 0xFF);
	      out[outputOffset + 198] = (byte) ((intValues49 >>> 8) & 0xFF);
	      out[outputOffset + 199] = (byte) (intValues49 & 0xFF);
	      out[outputOffset + 200] = (byte) ((intValues50 >>> 24) & 0xFF);
	      out[outputOffset + 201] = (byte) ((intValues50 >>> 16) & 0xFF);
	      out[outputOffset + 202] = (byte) ((intValues50 >>> 8) & 0xFF);
	      out[outputOffset + 203] = (byte) (intValues50 & 0xFF);
	      out[outputOffset + 204] = (byte) ((intValues51 >>> 24) & 0xFF);
	      out[outputOffset + 205] = (byte) ((intValues51 >>> 16) & 0xFF);
	      out[outputOffset + 206] = (byte) ((intValues51 >>> 8) & 0xFF);
	      out[outputOffset + 207] = (byte) (intValues51 & 0xFF);
	      out[outputOffset + 208] = (byte) ((intValues52 >>> 24) & 0xFF);
	      out[outputOffset + 209] = (byte) ((intValues52 >>> 16) & 0xFF);
	      out[outputOffset + 210] = (byte) ((intValues52 >>> 8) & 0xFF);
	      out[outputOffset + 211] = (byte) (intValues52 & 0xFF);
	      out[outputOffset + 212] = (byte) ((intValues53 >>> 24) & 0xFF);
	      out[outputOffset + 213] = (byte) ((intValues53 >>> 16) & 0xFF);
	      out[outputOffset + 214] = (byte) ((intValues53 >>> 8) & 0xFF);
	      out[outputOffset + 215] = (byte) (intValues53 & 0xFF);
	      out[outputOffset + 216] = (byte) ((intValues54 >>> 24) & 0xFF);
	      out[outputOffset + 217] = (byte) ((intValues54 >>> 16) & 0xFF);
	      out[outputOffset + 218] = (byte) ((intValues54 >>> 8) & 0xFF);
	      out[outputOffset + 219] = (byte) (intValues54 & 0xFF);
	      out[outputOffset + 220] = (byte) ((intValues55 >>> 24) & 0xFF);
	      out[outputOffset + 221] = (byte) ((intValues55 >>> 16) & 0xFF);
	      out[outputOffset + 222] = (byte) ((intValues55 >>> 8) & 0xFF);
	      out[outputOffset + 223] = (byte) (intValues55 & 0xFF);
	      out[outputOffset + 224] = (byte) ((intValues56 >>> 24) & 0xFF);
	      out[outputOffset + 225] = (byte) ((intValues56 >>> 16) & 0xFF);
	      out[outputOffset + 226] = (byte) ((intValues56 >>> 8) & 0xFF);
	      out[outputOffset + 227] = (byte) (intValues56 & 0xFF);
	      out[outputOffset + 228] = (byte) ((intValues57 >>> 24) & 0xFF);
	      out[outputOffset + 229] = (byte) ((intValues57 >>> 16) & 0xFF);
	      out[outputOffset + 230] = (byte) ((intValues57 >>> 8) & 0xFF);
	      out[outputOffset + 231] = (byte) (intValues57 & 0xFF);
	      out[outputOffset + 232] = (byte) ((intValues58 >>> 24) & 0xFF);
	      out[outputOffset + 233] = (byte) ((intValues58 >>> 16) & 0xFF);
	      out[outputOffset + 234] = (byte) ((intValues58 >>> 8) & 0xFF);
	      out[outputOffset + 235] = (byte) (intValues58 & 0xFF);
	      out[outputOffset + 236] = (byte) ((intValues59 >>> 24) & 0xFF);
	      out[outputOffset + 237] = (byte) ((intValues59 >>> 16) & 0xFF);
	      out[outputOffset + 238] = (byte) ((intValues59 >>> 8) & 0xFF);
	      out[outputOffset + 239] = (byte) (intValues59 & 0xFF);
	      out[outputOffset + 240] = (byte) ((intValues60 >>> 24) & 0xFF);
	      out[outputOffset + 241] = (byte) ((intValues60 >>> 16) & 0xFF);
	      out[outputOffset + 242] = (byte) ((intValues60 >>> 8) & 0xFF);
	      out[outputOffset + 243] = (byte) (intValues60 & 0xFF);
	      out[outputOffset + 244] = (byte) ((intValues61 >>> 24) & 0xFF);
	      out[outputOffset + 245] = (byte) ((intValues61 >>> 16) & 0xFF);
	      out[outputOffset + 246] = (byte) ((intValues61 >>> 8) & 0xFF);
	      out[outputOffset + 247] = (byte) (intValues61 & 0xFF);
	      out[outputOffset + 248] = (byte) ((intValues62 >>> 24) & 0xFF);
	      out[outputOffset + 249] = (byte) ((intValues62 >>> 16) & 0xFF);
	      out[outputOffset + 250] = (byte) ((intValues62 >>> 8) & 0xFF);
	      out[outputOffset + 251] = (byte) (intValues62 & 0xFF);
	      out[outputOffset + 252] = (byte) ((intValues63 >>> 24) & 0xFF);
	      out[outputOffset + 253] = (byte) ((intValues63 >>> 16) & 0xFF);
	      out[outputOffset + 254] = (byte) ((intValues63 >>> 8) & 0xFF);
	      out[outputOffset + 255] = (byte) (intValues63 & 0xFF);	      
		inpos.add(64);
		outpos.add(256);
	}
}
