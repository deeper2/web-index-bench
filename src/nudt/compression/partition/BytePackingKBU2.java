package nudt.compression.partition;


/**
 * BytePacking routines for VSE 256
 * 
 * @author Kun Jiang
 * 
 */
public final class BytePackingKBU2 {
	
	/**
	 * Pack the 32 integers
	 * 
	 * @param in
	 *            source array
	 * @param inpos
	 *            starting point in the source array
	 * @param out
	 *            output array
	 * @param outpos
	 *            starting point in the output array
	 * @param bit
	 *            how many bits to use per integer
	 */
	public static void fastunpack(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos, final int index) {
		switch (index) {
		//此处16维的bitwidth{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 20, 32 }
		//每一维16种情况(共256种),二维数组[16][16]
		case 0://0 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack0(in, inpos, out, outpos);
			break;
		case 1:
			fastunpack1(in, inpos, out, outpos);
			break;
		case 2:
			fastunpack2(in, inpos, out, outpos);
			break;
		case 3:
			fastunpack3(in, inpos, out, outpos);
			break;
		case 4:
			fastunpack4(in, inpos, out, outpos);
			break;
		case 5:
			fastunpack5(in, inpos, out, outpos);
			break;
		case 6:
			fastunpack6(in, inpos, out, outpos);
			break;
		case 7:
			fastunpack7(in, inpos, out, outpos);
			break;
		case 8:
			fastunpack8(in, inpos, out, outpos);
			break;
		case 9:
			fastunpack9(in, inpos, out, outpos);
			break;
		case 10:
			fastunpack10(in, inpos, out, outpos);
			break;
		case 11:
			fastunpack11(in, inpos, out, outpos);
			break;
		case 12:
			fastunpack12(in, inpos, out, outpos);
			break;
		case 13:
			fastunpack13(in, inpos, out, outpos);
			break;
		case 14:
			fastunpack14(in, inpos, out, outpos);
			break;
		case 15:
			fastunpack15(in, inpos, out, outpos);
			break;
		case 16://1 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack16(in, inpos, out, outpos);
			break;
		case 17:
			fastunpack17(in, inpos, out, outpos);
			break;
		case 18:
			fastunpack18(in, inpos, out, outpos);
			break;
		case 19:
			fastunpack19(in, inpos, out, outpos);
			break;
		case 20:
			fastunpack20(in, inpos, out, outpos);
			break;
		case 21:
			fastunpack21(in, inpos, out, outpos);
			break;
		case 22:
			fastunpack22(in, inpos, out, outpos);
			break;
		case 23:
			fastunpack23(in, inpos, out, outpos);
			break;
		case 24:
			fastunpack24(in, inpos, out, outpos);
			break;
		case 25:
			fastunpack25(in, inpos, out, outpos);
			break;
		case 26:
			fastunpack26(in, inpos, out, outpos);
			break;
		case 27:
			fastunpack27(in, inpos, out, outpos);
			break;
		case 28:
			fastunpack28(in, inpos, out, outpos);
			break;
		case 29:
			fastunpack29(in, inpos, out, outpos);
			break;
		case 30:
			fastunpack30(in, inpos, out, outpos);
			break;
		case 31:
			fastunpack31(in, inpos, out, outpos);
			break;
		case 32://2 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack32(in, inpos, out, outpos);
			break;
		case 33:
			fastunpack33(in, inpos, out, outpos);
			break;
		case 34:
			fastunpack34(in, inpos, out, outpos);
			break;
		case 35:
			fastunpack35(in, inpos, out, outpos);
			break;
		case 36:
			fastunpack36(in, inpos, out, outpos);
			break;
		case 37:
			fastunpack37(in, inpos, out, outpos);
			break;
		case 38:
			fastunpack38(in, inpos, out, outpos);
			break;
		case 39:
			fastunpack39(in, inpos, out, outpos);
			break;
		case 40:
			fastunpack40(in, inpos, out, outpos);
			break;
		case 41:
			fastunpack41(in, inpos, out, outpos);
			break;
		case 42:
			fastunpack42(in, inpos, out, outpos);
			break;
		case 43:
			fastunpack43(in, inpos, out, outpos);
			break;
		case 44:
			fastunpack44(in, inpos, out, outpos);
			break;
		case 45:
			fastunpack45(in, inpos, out, outpos);
			break;
		case 46:
			fastunpack46(in, inpos, out, outpos);
			break;
		case 47:
			fastunpack47(in, inpos, out, outpos);
			break;
		case 48://3 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack48(in, inpos, out, outpos);
			break;
		case 49:
			fastunpack49(in, inpos, out, outpos);
			break;
		case 50:
			fastunpack50(in, inpos, out, outpos);
			break;
		case 51:
			fastunpack51(in, inpos, out, outpos);
			break;
		case 52:
			fastunpack52(in, inpos, out, outpos);
			break;
		case 53:
			fastunpack53(in, inpos, out, outpos);
			break;
		case 54:
			fastunpack54(in, inpos, out, outpos);
			break;
		case 55:
			fastunpack55(in, inpos, out, outpos);
			break;
		case 56:
			fastunpack56(in, inpos, out, outpos);
			break;
		case 57:
			fastunpack57(in, inpos, out, outpos);
			break;
		case 58:
			fastunpack58(in, inpos, out, outpos);
			break;
		case 59:
			fastunpack59(in, inpos, out, outpos);
			break;
		case 60:
			fastunpack60(in, inpos, out, outpos);
			break;
		case 61:
			fastunpack61(in, inpos, out, outpos);
			break;
		case 62:
			fastunpack62(in, inpos, out, outpos);
			break;
		case 63:
			fastunpack63(in, inpos, out, outpos);
			break;
		case 64://4 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack64(in, inpos, out, outpos);
			break;
		case 65:
			fastunpack65(in, inpos, out, outpos);
			break;
		case 66:
			fastunpack66(in, inpos, out, outpos);
			break;
		case 67:
			fastunpack67(in, inpos, out, outpos);
			break;
		case 68:
			fastunpack68(in, inpos, out, outpos);
			break;
		case 69:
			fastunpack69(in, inpos, out, outpos);
			break;
		case 70:
			fastunpack70(in, inpos, out, outpos);
			break;
		case 71:
			fastunpack71(in, inpos, out, outpos);
			break;
		case 72:
			fastunpack72(in, inpos, out, outpos);
			break;
		case 73:
			fastunpack73(in, inpos, out, outpos);
			break;
		case 74:
			fastunpack74(in, inpos, out, outpos);
			break;
		case 75:
			fastunpack75(in, inpos, out, outpos);
			break;
		case 76:
			fastunpack76(in, inpos, out, outpos);
			break;
		case 77:
			fastunpack77(in, inpos, out, outpos);
			break;
		case 78:
			fastunpack78(in, inpos, out, outpos);
			break;
		case 79:
			fastunpack79(in, inpos, out, outpos);
			break;
		case 80://5 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack80(in, inpos, out, outpos);
			break;
		case 81:
			fastunpack81(in, inpos, out, outpos);
			break;
		case 82:
			fastunpack82(in, inpos, out, outpos);
			break;
		case 83:
			fastunpack83(in, inpos, out, outpos);
			break;
		case 84:
			fastunpack84(in, inpos, out, outpos);
			break;
		case 85:
			fastunpack85(in, inpos, out, outpos);
			break;
		case 86:
			fastunpack86(in, inpos, out, outpos);
			break;
		case 87:
			fastunpack87(in, inpos, out, outpos);
			break;
		case 88:
			fastunpack88(in, inpos, out, outpos);
			break;
		case 89:
			fastunpack89(in, inpos, out, outpos);
			break;
		case 90:
			fastunpack90(in, inpos, out, outpos);
			break;
		case 91:
			fastunpack91(in, inpos, out, outpos);
			break;
		case 92:
			fastunpack92(in, inpos, out, outpos);
			break;
		case 93:
			fastunpack93(in, inpos, out, outpos);
			break;
		case 94:
			fastunpack94(in, inpos, out, outpos);
			break;
		case 95:
			fastunpack95(in, inpos, out, outpos);
			break;
		case 96://6 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack96(in, inpos, out, outpos);
			break;
		case 97:
			fastunpack97(in, inpos, out, outpos);
			break;
		case 98:
			fastunpack98(in, inpos, out, outpos);
			break;
		case 99:
			fastunpack99(in, inpos, out, outpos);
			break;
		case 100:
			fastunpack100(in, inpos, out, outpos);
			break;
		case 101:
			fastunpack101(in, inpos, out, outpos);
			break;
		case 102:
			fastunpack102(in, inpos, out, outpos);
			break;
		case 103:
			fastunpack103(in, inpos, out, outpos);
			break;
		case 104:
			fastunpack104(in, inpos, out, outpos);
			break;
		case 105:
			fastunpack105(in, inpos, out, outpos);
			break;
		case 106:
			fastunpack106(in, inpos, out, outpos);
			break;
		case 107:
			fastunpack107(in, inpos, out, outpos);
			break;
		case 108:
			fastunpack108(in, inpos, out, outpos);
			break;
		case 109:
			fastunpack109(in, inpos, out, outpos);
			break;
		case 110:
			fastunpack110(in, inpos, out, outpos);
			break;
		case 111:
			fastunpack111(in, inpos, out, outpos);
			break;
		case 112://7 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack112(in, inpos, out, outpos);
			break;
		case 113:
			fastunpack113(in, inpos, out, outpos);
			break;
		case 114:
			fastunpack114(in, inpos, out, outpos);
			break;
		case 115:
			fastunpack115(in, inpos, out, outpos);
			break;
		case 116:
			fastunpack116(in, inpos, out, outpos);
			break;
		case 117:
			fastunpack117(in, inpos, out, outpos);
			break;
		case 118:
			fastunpack118(in, inpos, out, outpos);
			break;
		case 119:
			fastunpack119(in, inpos, out, outpos);
			break;
		case 120:
			fastunpack120(in, inpos, out, outpos);
			break;
		case 121:
			fastunpack121(in, inpos, out, outpos);
			break;
		case 122:
			fastunpack122(in, inpos, out, outpos);
			break;
		case 123:
			fastunpack123(in, inpos, out, outpos);
			break;
		case 124:
			fastunpack124(in, inpos, out, outpos);
			break;
		case 125:
			fastunpack125(in, inpos, out, outpos);
			break;
		case 126:
			fastunpack126(in, inpos, out, outpos);
			break;
		case 127:
			fastunpack127(in, inpos, out, outpos);
			break;
		case 128://8 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack128(in, inpos, out, outpos);
			break;
		case 129:
			fastunpack129(in, inpos, out, outpos);
			break;
		case 130:
			fastunpack130(in, inpos, out, outpos);
			break;
		case 131:
			fastunpack131(in, inpos, out, outpos);
			break;
		case 132:
			fastunpack132(in, inpos, out, outpos);
			break;
		case 133:
			fastunpack133(in, inpos, out, outpos);
			break;
		case 134:
			fastunpack134(in, inpos, out, outpos);
			break;
		case 135:
			fastunpack135(in, inpos, out, outpos);
			break;
		case 136:
			fastunpack136(in, inpos, out, outpos);
			break;
		case 137:
			fastunpack137(in, inpos, out, outpos);
			break;
		case 138:
			fastunpack138(in, inpos, out, outpos);
			break;
		case 139:
			fastunpack139(in, inpos, out, outpos);
			break;
		case 140:
			fastunpack140(in, inpos, out, outpos);
			break;
		case 141:
			fastunpack141(in, inpos, out, outpos);
			break;
		case 142:
			fastunpack142(in, inpos, out, outpos);
			break;
		case 143:
			fastunpack143(in, inpos, out, outpos);
			break;
		case 144://9 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack144(in, inpos, out, outpos);
			break;
		case 145:
			fastunpack145(in, inpos, out, outpos);
			break;
		case 146:
			fastunpack146(in, inpos, out, outpos);
			break;
		case 147:
			fastunpack147(in, inpos, out, outpos);
			break;
		case 148:
			fastunpack148(in, inpos, out, outpos);
			break;
		case 149:
			fastunpack149(in, inpos, out, outpos);
			break;
		case 150:
			fastunpack150(in, inpos, out, outpos);
			break;
		case 151:
			fastunpack151(in, inpos, out, outpos);
			break;
		case 152:
			fastunpack152(in, inpos, out, outpos);
			break;
		case 153:
			fastunpack153(in, inpos, out, outpos);
			break;
		case 154:
			fastunpack154(in, inpos, out, outpos);
			break;
		case 155:
			fastunpack155(in, inpos, out, outpos);
			break;
		case 156:
			fastunpack156(in, inpos, out, outpos);
			break;
		case 157:
			fastunpack157(in, inpos, out, outpos);
			break;
		case 158:
			fastunpack158(in, inpos, out, outpos);
			break;
		case 159:
			fastunpack159(in, inpos, out, outpos);
			break;
		case 160://10 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack160(in, inpos, out, outpos);
			break;
		case 161:
			fastunpack161(in, inpos, out, outpos);
			break;
		case 162:
			fastunpack162(in, inpos, out, outpos);
			break;
		case 163:
			fastunpack163(in, inpos, out, outpos);
			break;
		case 164:
			fastunpack164(in, inpos, out, outpos);
			break;
		case 165:
			fastunpack165(in, inpos, out, outpos);
			break;
		case 166:
			fastunpack166(in, inpos, out, outpos);
			break;
		case 167:
			fastunpack167(in, inpos, out, outpos);
			break;
		case 168:
			fastunpack168(in, inpos, out, outpos);
			break;
		case 169:
			fastunpack169(in, inpos, out, outpos);
			break;
		case 170:
			fastunpack170(in, inpos, out, outpos);
			break;
		case 171:
			fastunpack171(in, inpos, out, outpos);
			break;
		case 172:
			fastunpack172(in, inpos, out, outpos);
			break;
		case 173:
			fastunpack173(in, inpos, out, outpos);
			break;
		case 174:
			fastunpack174(in, inpos, out, outpos);
			break;
		case 175:
			fastunpack175(in, inpos, out, outpos);
			break;
		case 176:
			fastunpack176(in, inpos, out, outpos);
			break;
		case 177://11 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack177(in, inpos, out, outpos);
			break;
		case 178:
			fastunpack178(in, inpos, out, outpos);
			break;
		case 179:
			fastunpack179(in, inpos, out, outpos);
			break;
		case 180:
			fastunpack180(in, inpos, out, outpos);
			break;
		case 181:
			fastunpack181(in, inpos, out, outpos);
			break;
		case 182:
			fastunpack182(in, inpos, out, outpos);
			break;
		case 183:
			fastunpack183(in, inpos, out, outpos);
			break;
		case 184:
			fastunpack184(in, inpos, out, outpos);
			break;
		case 185:
			fastunpack185(in, inpos, out, outpos);
			break;
		case 186:
			fastunpack186(in, inpos, out, outpos);
			break;
		case 187:
			fastunpack187(in, inpos, out, outpos);
			break;
		case 188:
			fastunpack188(in, inpos, out, outpos);
			break;
		case 189:
			fastunpack189(in, inpos, out, outpos);
			break;
		case 190:
			fastunpack190(in, inpos, out, outpos);
			break;
		case 191:
			fastunpack191(in, inpos, out, outpos);
			break;
		case 192:
			fastunpack192(in, inpos, out, outpos);
			break;
		case 193://12 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack193(in, inpos, out, outpos);
			break;
		case 194:
			fastunpack194(in, inpos, out, outpos);
			break;
		case 195:
			fastunpack195(in, inpos, out, outpos);
			break;
		case 196:
			fastunpack196(in, inpos, out, outpos);
			break;
		case 197:
			fastunpack197(in, inpos, out, outpos);
			break;
		case 198:
			fastunpack198(in, inpos, out, outpos);
			break;
		case 199:
			fastunpack199(in, inpos, out, outpos);
			break;
		case 200:
			fastunpack200(in, inpos, out, outpos);
			break;
		case 201:
			fastunpack201(in, inpos, out, outpos);
			break;
		case 202:
			fastunpack202(in, inpos, out, outpos);
			break;
		case 203:
			fastunpack203(in, inpos, out, outpos);
			break;
		case 204:
			fastunpack204(in, inpos, out, outpos);
			break;
		case 205:
			fastunpack205(in, inpos, out, outpos);
			break;
		case 206:
			fastunpack206(in, inpos, out, outpos);
			break;
		case 207:
			fastunpack207(in, inpos, out, outpos);
			break;
		case 208://16 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack208(in, inpos, out, outpos);
			break;
		case 209:
			fastunpack209(in, inpos, out, outpos);
			break;
		case 210:
			fastunpack210(in, inpos, out, outpos);
			break;
		case 211:
			fastunpack211(in, inpos, out, outpos);
			break;
		case 212:
			fastunpack212(in, inpos, out, outpos);
			break;
		case 213:
			fastunpack213(in, inpos, out, outpos);
			break;
		case 214:
			fastunpack214(in, inpos, out, outpos);
			break;
		case 215:
			fastunpack215(in, inpos, out, outpos);
			break;
		case 216:
			fastunpack216(in, inpos, out, outpos);
			break;
		case 217:
			fastunpack217(in, inpos, out, outpos);
			break;
		case 218:
			fastunpack218(in, inpos, out, outpos);
			break;
		case 219:
			fastunpack219(in, inpos, out, outpos);
			break;
		case 220:
			fastunpack220(in, inpos, out, outpos);
			break;
		case 221:
			fastunpack221(in, inpos, out, outpos);
			break;
		case 222:
			fastunpack222(in, inpos, out, outpos);
			break;
		case 223:
			fastunpack223(in, inpos, out, outpos);
			break;
		case 224://20 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack224(in, inpos, out, outpos);
			break;
		case 225:
			fastunpack225(in, inpos, out, outpos);
			break;
		case 226:
			fastunpack226(in, inpos, out, outpos);
			break;
		case 227:
			fastunpack227(in, inpos, out, outpos);
			break;
		case 228:
			fastunpack228(in, inpos, out, outpos);
			break;
		case 229:
			fastunpack229(in, inpos, out, outpos);
			break;
		case 230:
			fastunpack230(in, inpos, out, outpos);
			break;
		case 231:
			fastunpack231(in, inpos, out, outpos);
			break;
		case 232:
			fastunpack232(in, inpos, out, outpos);
			break;
		case 233:
			fastunpack233(in, inpos, out, outpos);
			break;
		case 234:
			fastunpack234(in, inpos, out, outpos);
			break;
		case 235:
			fastunpack235(in, inpos, out, outpos);
			break;
		case 236:
			fastunpack236(in, inpos, out, outpos);
			break;
		case 237:
			fastunpack237(in, inpos, out, outpos);
			break;
		case 238:
			fastunpack238(in, inpos, out, outpos);
			break;
		case 239:
			fastunpack239(in, inpos, out, outpos);
			break;
		case 240://32 bits with 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 32, 64 integers
			fastunpack240(in, inpos, out, outpos);
			break;
		case 241:
			fastunpack241(in, inpos, out, outpos);
			break;
		case 242:
			fastunpack242(in, inpos, out, outpos);
			break;
		case 243:
			fastunpack243(in, inpos, out, outpos);
			break;
		case 244:
			fastunpack244(in, inpos, out, outpos);
			break;
		case 245:
			fastunpack245(in, inpos, out, outpos);
			break;
		case 246:
			fastunpack246(in, inpos, out, outpos);
			break;
		case 247:
			fastunpack247(in, inpos, out, outpos);
			break;
		case 248:
			fastunpack248(in, inpos, out, outpos);
			break;
		case 249:
			fastunpack249(in, inpos, out, outpos);
			break;
		case 250:
			fastunpack250(in, inpos, out, outpos);
			break;
		case 251:
			fastunpack251(in, inpos, out, outpos);
			break;
		case 252:
			fastunpack252(in, inpos, out, outpos);
			break;
		case 253:
			fastunpack253(in, inpos, out, outpos);
			break;
		case 254:
			fastunpack254(in, inpos, out, outpos);
			break;
		case 255:
			fastunpack255(in, inpos, out, outpos);
			break;
		default:
			throw new IllegalArgumentException("Unsupported bit width.");
		}
	}
	
	//1 0bit
	protected static void fastunpack0(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;

		inpos.add(1);
		outpos.add(1);
	}
	
	//2 0bit
	protected static void fastunpack1(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;

		inpos.add(1);
		outpos.add(2);
	}
	
	//3 0bit
	protected static void fastunpack2(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;

		inpos.add(1);
		outpos.add(3);
	}
	
	//4 0bit
	protected static void fastunpack3(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;

		inpos.add(1);
		outpos.add(4);
	}
	
	//5 0bit
	protected static void fastunpack4(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;

		inpos.add(1);
		outpos.add(5);
	}
	
	//6 0bit
	protected static void fastunpack5(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;

		inpos.add(1);
		outpos.add(6);
	}
	
	//7 0bit
	protected static void fastunpack6(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;

		inpos.add(1);
		outpos.add(7);
	}
	
	//8 0bit
	protected static void fastunpack7(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;

		inpos.add(1);
		outpos.add(8);
	}
	
	//9 0bit
	protected static void fastunpack8(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;

		inpos.add(1);
		outpos.add(9);
	}
	
	//10 0bit
	protected static void fastunpack9(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;

		inpos.add(1);
		outpos.add(10);
	}
	
	//11 0bit
	protected static void fastunpack10(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;

		inpos.add(1);
		outpos.add(11);
	}
	
	//12 0bit
	protected static void fastunpack11(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;

		inpos.add(1);
		outpos.add(12);
	}
	
	//14 0bit
	protected static void fastunpack12(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;
	      out[outOffset + 12] = 0;
	      out[outOffset + 13] = 0;

		inpos.add(1);
		outpos.add(14);
	}
	
	//16 0bit
	protected static void fastunpack13(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;
	      out[outOffset + 12] = 0;
	      out[outOffset + 13] = 0;
	      out[outOffset + 14] = 0;
	      out[outOffset + 15] = 0;

		inpos.add(1);
		outpos.add(16);
	}
	
	//32 0bit
	protected static void fastunpack14(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;
	      out[outOffset + 12] = 0;
	      out[outOffset + 13] = 0;
	      out[outOffset + 14] = 0;
	      out[outOffset + 15] = 0;
	      out[outOffset + 16] = 0;
	      out[outOffset + 17] = 0;
	      out[outOffset + 18] = 0;
	      out[outOffset + 19] = 0;
	      out[outOffset + 20] = 0;
	      out[outOffset + 21] = 0;
	      out[outOffset + 22] = 0;
	      out[outOffset + 23] = 0;
	      out[outOffset + 24] = 0;
	      out[outOffset + 25] = 0;
	      out[outOffset + 26] = 0;
	      out[outOffset + 27] = 0;
	      out[outOffset + 28] = 0;
	      out[outOffset + 29] = 0;
	      out[outOffset + 30] = 0;
	      out[outOffset + 31] = 0;

		inpos.add(1);
		outpos.add(32);
	}
	
	//64 0bit
	protected static void fastunpack15(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		//final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();
		
	      out[outOffset] = 0;
	      out[outOffset + 1] = 0;
	      out[outOffset + 2] = 0;
	      out[outOffset + 3] = 0;
	      out[outOffset + 4] = 0;
	      out[outOffset + 5] = 0;
	      out[outOffset + 6] = 0;
	      out[outOffset + 7] = 0;
	      out[outOffset + 8] = 0;
	      out[outOffset + 9] = 0;
	      out[outOffset + 10] = 0;
	      out[outOffset + 11] = 0;
	      out[outOffset + 12] = 0;
	      out[outOffset + 13] = 0;
	      out[outOffset + 14] = 0;
	      out[outOffset + 15] = 0;
	      out[outOffset + 16] = 0;
	      out[outOffset + 17] = 0;
	      out[outOffset + 18] = 0;
	      out[outOffset + 19] = 0;
	      out[outOffset + 20] = 0;
	      out[outOffset + 21] = 0;
	      out[outOffset + 22] = 0;
	      out[outOffset + 23] = 0;
	      out[outOffset + 24] = 0;
	      out[outOffset + 25] = 0;
	      out[outOffset + 26] = 0;
	      out[outOffset + 27] = 0;
	      out[outOffset + 28] = 0;
	      out[outOffset + 29] = 0;
	      out[outOffset + 30] = 0;
	      out[outOffset + 31] = 0;
	      out[outOffset + 32] = 0;
	      out[outOffset + 33] = 0;
	      out[outOffset + 34] = 0;
	      out[outOffset + 35] = 0;
	      out[outOffset + 36] = 0;
	      out[outOffset + 37] = 0;
	      out[outOffset + 38] = 0;
	      out[outOffset + 39] = 0;
	      out[outOffset + 40] = 0;
	      out[outOffset + 41] = 0;
	      out[outOffset + 42] = 0;
	      out[outOffset + 43] = 0;
	      out[outOffset + 44] = 0;
	      out[outOffset + 45] = 0;
	      out[outOffset + 46] = 0;
	      out[outOffset + 47] = 0;
	      out[outOffset + 48] = 0;
	      out[outOffset + 49] = 0;
	      out[outOffset + 50] = 0;
	      out[outOffset + 51] = 0;
	      out[outOffset + 52] = 0;
	      out[outOffset + 53] = 0;
	      out[outOffset + 54] = 0;
	      out[outOffset + 55] = 0;
	      out[outOffset + 56] = 0;
	      out[outOffset + 57] = 0;
	      out[outOffset + 58] = 0;
	      out[outOffset + 59] = 0;
	      out[outOffset + 60] = 0;
	      out[outOffset + 61] = 0;
	      out[outOffset + 62] = 0;
	      out[outOffset + 63] = 0;

		inpos.add(1);
		outpos.add(64);
	}
	
	//1 1bit
	protected static void fastunpack16(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
		
		inpos.add(2);
		outpos.add(1);
	}

	//2 1bit
	protected static void fastunpack17(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
		
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 1bit
	protected static void fastunpack18(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
		
		inpos.add(2);
		outpos.add(3);
	}
	
	//4 1bit
	protected static void fastunpack19(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
		
		inpos.add(2);
		outpos.add(4);
	}
	
	//5 1bit
	protected static void fastunpack20(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
		
		inpos.add(2);
		outpos.add(5);
	}
	
	//6 1bit
	protected static void fastunpack21(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
		
		inpos.add(2);
		outpos.add(6);
	}
	
	//7 1bit
	protected static void fastunpack22(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
		
		inpos.add(2);
		outpos.add(7);
	}
	
	//8 1bit
	protected static void fastunpack23(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
		
		inpos.add(2);
		outpos.add(8);
	}
	
	//9 1bit
	protected static void fastunpack24(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
		
		inpos.add(3);
		outpos.add(9);
	}
	
	//10 1bit
	protected static void fastunpack25(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
		
		inpos.add(3);
		outpos.add(10);
	}
	
	//11 1bit
	protected static void fastunpack26(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
		
		inpos.add(3);
		outpos.add(11);
	}
	
	//12 1bit
	protected static void fastunpack27(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
	      out[outOffset + 11] = (i0 >>> 20) & 1;
		
		inpos.add(3);
		outpos.add(12);
	}
	
	//14 1bit
	protected static void fastunpack28(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
	      out[outOffset + 11] = (i0 >>> 20) & 1;
	      out[outOffset + 12] = (i0 >>> 19) & 1;
	      out[outOffset + 13] = (i0 >>> 18) & 1;
		
		inpos.add(3);
		outpos.add(14);
	}
	
	//16 1bit
	protected static void fastunpack29(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
	      out[outOffset + 11] = (i0 >>> 20) & 1;
	      out[outOffset + 12] = (i0 >>> 19) & 1;
	      out[outOffset + 13] = (i0 >>> 18) & 1;
	      out[outOffset + 14] = (i0 >>> 17) & 1;
	      out[outOffset + 15] = (i0 >>> 16) & 1;
		
		inpos.add(3);
		outpos.add(16);
	}
	
	//32 1bit
	protected static void fastunpack30(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
	      out[outOffset + 11] = (i0 >>> 20) & 1;
	      out[outOffset + 12] = (i0 >>> 19) & 1;
	      out[outOffset + 13] = (i0 >>> 18) & 1;
	      out[outOffset + 14] = (i0 >>> 17) & 1;
	      out[outOffset + 15] = (i0 >>> 16) & 1;
	      out[outOffset + 16] = (i0 >>> 15) & 1;
	      out[outOffset + 17] = (i0 >>> 14) & 1;
	      out[outOffset + 18] = (i0 >>> 13) & 1;
	      out[outOffset + 19] = (i0 >>> 12) & 1;
	      out[outOffset + 20] = (i0 >>> 11) & 1;
	      out[outOffset + 21] = (i0 >>> 10) & 1;
	      out[outOffset + 22] = (i0 >>> 9) & 1;
	      out[outOffset + 23] = (i0 >>> 8) & 1;
	      out[outOffset + 24] = (i0 >>> 7) & 1;
	      out[outOffset + 25] = (i0 >>> 6) & 1;
	      out[outOffset + 26] = (i0 >>> 5) & 1;
	      out[outOffset + 27] = (i0 >>> 4) & 1;
	      out[outOffset + 28] = (i0 >>> 3) & 1;
	      out[outOffset + 29] = (i0 >>> 2) & 1;
	      out[outOffset + 30] = (i0 >>> 1) & 1;
	      out[outOffset + 31] = i0 & 1;
		
		inpos.add(5);
		outpos.add(32);
	}
	
	//64 1bit
	protected static void fastunpack31(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 31);
	      out[outOffset + 1] = (i0 >>> 30) & 1;
	      out[outOffset + 2] = (i0 >>> 29) & 1;
	      out[outOffset + 3] = (i0 >>> 28) & 1;
	      out[outOffset + 4] = (i0 >>> 27) & 1;
	      out[outOffset + 5] = (i0 >>> 26) & 1;
	      out[outOffset + 6] = (i0 >>> 25) & 1;
	      out[outOffset + 7] = (i0 >>> 24) & 1;
	      out[outOffset + 8] = (i0 >>> 23) & 1;
	      out[outOffset + 9] = (i0 >>> 22) & 1;
	      out[outOffset + 10] = (i0 >>> 21) & 1;
	      out[outOffset + 11] = (i0 >>> 20) & 1;
	      out[outOffset + 12] = (i0 >>> 19) & 1;
	      out[outOffset + 13] = (i0 >>> 18) & 1;
	      out[outOffset + 14] = (i0 >>> 17) & 1;
	      out[outOffset + 15] = (i0 >>> 16) & 1;
	      out[outOffset + 16] = (i0 >>> 15) & 1;
	      out[outOffset + 17] = (i0 >>> 14) & 1;
	      out[outOffset + 18] = (i0 >>> 13) & 1;
	      out[outOffset + 19] = (i0 >>> 12) & 1;
	      out[outOffset + 20] = (i0 >>> 11) & 1;
	      out[outOffset + 21] = (i0 >>> 10) & 1;
	      out[outOffset + 22] = (i0 >>> 9) & 1;
	      out[outOffset + 23] = (i0 >>> 8) & 1;
	      out[outOffset + 24] = (i0 >>> 7) & 1;
	      out[outOffset + 25] = (i0 >>> 6) & 1;
	      out[outOffset + 26] = (i0 >>> 5) & 1;
	      out[outOffset + 27] = (i0 >>> 4) & 1;
	      out[outOffset + 28] = (i0 >>> 3) & 1;
	      out[outOffset + 29] = (i0 >>> 2) & 1;
	      out[outOffset + 30] = (i0 >>> 1) & 1;
	      out[outOffset + 31] = i0 & 1;
	    
	      out[outOffset + 32] = (i1 >>> 31);
	      out[outOffset + 33] = (i1 >>> 30) & 1;
	      out[outOffset + 34] = (i1 >>> 29) & 1;
	      out[outOffset + 35] = (i1 >>> 28) & 1;
	      out[outOffset + 36] = (i1 >>> 27) & 1;
	      out[outOffset + 37] = (i1 >>> 26) & 1;
	      out[outOffset + 38] = (i1 >>> 25) & 1;
	      out[outOffset + 39] = (i1 >>> 24) & 1;
	      out[outOffset + 40] = (i1 >>> 23) & 1;
	      out[outOffset + 41] = (i1 >>> 22) & 1;
	      out[outOffset + 42] = (i1 >>> 21) & 1;
	      out[outOffset + 43] = (i1 >>> 20) & 1;
	      out[outOffset + 44] = (i1 >>> 19) & 1;
	      out[outOffset + 45] = (i1 >>> 18) & 1;
	      out[outOffset + 46] = (i1 >>> 17) & 1;
	      out[outOffset + 47] = (i1 >>> 16) & 1;
	      out[outOffset + 48] = (i1 >>> 15) & 1;
	      out[outOffset + 49] = (i1 >>> 14) & 1;
	      out[outOffset + 50] = (i1 >>> 13) & 1;
	      out[outOffset + 51] = (i1 >>> 12) & 1;
	      out[outOffset + 52] = (i1 >>> 11) & 1;
	      out[outOffset + 53] = (i1 >>> 10) & 1;
	      out[outOffset + 54] = (i1 >>> 9) & 1;
	      out[outOffset + 55] = (i1 >>> 8) & 1;
	      out[outOffset + 56] = (i1 >>> 7) & 1;
	      out[outOffset + 57] = (i1 >>> 6) & 1;
	      out[outOffset + 58] = (i1 >>> 5) & 1;
	      out[outOffset + 59] = (i1 >>> 4) & 1;
	      out[outOffset + 60] = (i1 >>> 3) & 1;
	      out[outOffset + 61] = (i1 >>> 2) & 1;
	      out[outOffset + 62] = (i1 >>> 1) & 1;
	      out[outOffset + 63] = i1 & 1;
		
		inpos.add(9);
		outpos.add(64);
	}
	
	//1 2bits
	protected static void fastunpack32(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 30);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 2bits
	protected static void fastunpack33(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
		
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 2bits
	protected static void fastunpack34(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
		
		inpos.add(2);
		outpos.add(3);
	}
	
	//4 2bits
	protected static void fastunpack35(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
		
		inpos.add(2);
		outpos.add(4);
	}
	
	//5 2bits
	protected static void fastunpack36(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
		
		inpos.add(3);
		outpos.add(5);
	}
	
	//6 2bits
	protected static void fastunpack37(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
		
		inpos.add(3);
		outpos.add(6);
	}
	
	//7 2bits
	protected static void fastunpack38(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
		
		inpos.add(3);
		outpos.add(7);
	}
	
	//8 2bits
	protected static void fastunpack39(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
		
		inpos.add(3);
		outpos.add(8);
	}
	
	//9 2bits
	protected static void fastunpack40(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
		
		inpos.add(4);
		outpos.add(9);
	}
	
	//10 2bits
	protected static void fastunpack41(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
		
		inpos.add(4);
		outpos.add(10);
	}
	
	//11 2bits
	protected static void fastunpack42(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
		
		inpos.add(4);
		outpos.add(11);
	}
	
	//12 2bits
	protected static void fastunpack43(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
	      out[outOffset + 11] = (i0 >>> 8) & 3;
		
		inpos.add(4);
		outpos.add(12);
	}
	
	//14 2bits
	protected static void fastunpack44(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
	      out[outOffset + 11] = (i0 >>> 8) & 3;
	      out[outOffset + 12] = (i0 >>> 6) & 3;
	      out[outOffset + 13] = (i0 >>> 4) & 3;
		
		inpos.add(5);
		outpos.add(14);
	}
	
	//16 2bits
	protected static void fastunpack45(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      
	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
	      out[outOffset + 11] = (i0 >>> 8) & 3;
	      out[outOffset + 12] = (i0 >>> 6) & 3;
	      out[outOffset + 13] = (i0 >>> 4) & 3;
	      out[outOffset + 14] = (i0 >>> 2) & 3;
	      out[outOffset + 15] = i0 & 3;
		
		inpos.add(5);
		outpos.add(16);
	}
	
	//32 2bits
	protected static void fastunpack46(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
	      out[outOffset + 11] = (i0 >>> 8) & 3;
	      out[outOffset + 12] = (i0 >>> 6) & 3;
	      out[outOffset + 13] = (i0 >>> 4) & 3;
	      out[outOffset + 14] = (i0 >>> 2) & 3;
	      out[outOffset + 15] = i0 & 3;
	      out[outOffset + 16] = (i1 >>> 30);
	      out[outOffset + 17] = (i1 >>> 28) & 3;
	      out[outOffset + 18] = (i1 >>> 26) & 3;
	      out[outOffset + 19] = (i1 >>> 24) & 3;
	      out[outOffset + 20] = (i1 >>> 22) & 3;
	      out[outOffset + 21] = (i1 >>> 20) & 3;
	      out[outOffset + 22] = (i1 >>> 18) & 3;
	      out[outOffset + 23] = (i1 >>> 16) & 3;
	      out[outOffset + 24] = (i1 >>> 14) & 3;
	      out[outOffset + 25] = (i1 >>> 12) & 3;
	      out[outOffset + 26] = (i1 >>> 10) & 3;
	      out[outOffset + 27] = (i1 >>> 8) & 3;
	      out[outOffset + 28] = (i1 >>> 6) & 3;
	      out[outOffset + 29] = (i1 >>> 4) & 3;
	      out[outOffset + 30] = (i1 >>> 2) & 3;
	      out[outOffset + 31] = i1 & 3;
		
		inpos.add(9);
		outpos.add(32);
	}
	
	//64 2bits
	protected static void fastunpack47(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 30);
	      out[outOffset + 1] = (i0 >>> 28) & 3;
	      out[outOffset + 2] = (i0 >>> 26) & 3;
	      out[outOffset + 3] = (i0 >>> 24) & 3;
	      out[outOffset + 4] = (i0 >>> 22) & 3;
	      out[outOffset + 5] = (i0 >>> 20) & 3;
	      out[outOffset + 6] = (i0 >>> 18) & 3;
	      out[outOffset + 7] = (i0 >>> 16) & 3;
	      out[outOffset + 8] = (i0 >>> 14) & 3;
	      out[outOffset + 9] = (i0 >>> 12) & 3;
	      out[outOffset + 10] = (i0 >>> 10) & 3;
	      out[outOffset + 11] = (i0 >>> 8) & 3;
	      out[outOffset + 12] = (i0 >>> 6) & 3;
	      out[outOffset + 13] = (i0 >>> 4) & 3;
	      out[outOffset + 14] = (i0 >>> 2) & 3;
	      out[outOffset + 15] = i0 & 3;
	      out[outOffset + 16] = (i1 >>> 30);
	      out[outOffset + 17] = (i1 >>> 28) & 3;
	      out[outOffset + 18] = (i1 >>> 26) & 3;
	      out[outOffset + 19] = (i1 >>> 24) & 3;
	      out[outOffset + 20] = (i1 >>> 22) & 3;
	      out[outOffset + 21] = (i1 >>> 20) & 3;
	      out[outOffset + 22] = (i1 >>> 18) & 3;
	      out[outOffset + 23] = (i1 >>> 16) & 3;
	      out[outOffset + 24] = (i1 >>> 14) & 3;
	      out[outOffset + 25] = (i1 >>> 12) & 3;
	      out[outOffset + 26] = (i1 >>> 10) & 3;
	      out[outOffset + 27] = (i1 >>> 8) & 3;
	      out[outOffset + 28] = (i1 >>> 6) & 3;
	      out[outOffset + 29] = (i1 >>> 4) & 3;
	      out[outOffset + 30] = (i1 >>> 2) & 3;
	      out[outOffset + 31] = i1 & 3;	      
	      
	      out[outOffset + 32] = (i2 >>> 30);
	      out[outOffset + 33] = (i2 >>> 28) & 3;
	      out[outOffset + 34] = (i2 >>> 26) & 3;
	      out[outOffset + 35] = (i2 >>> 24) & 3;
	      out[outOffset + 36] = (i2 >>> 22) & 3;
	      out[outOffset + 37] = (i2 >>> 20) & 3;
	      out[outOffset + 38] = (i2 >>> 18) & 3;
	      out[outOffset + 39] = (i2 >>> 16) & 3;
	      out[outOffset + 40] = (i2 >>> 14) & 3;
	      out[outOffset + 41] = (i2 >>> 12) & 3;
	      out[outOffset + 42] = (i2 >>> 10) & 3;
	      out[outOffset + 43] = (i2 >>> 8) & 3;
	      out[outOffset + 44] = (i2 >>> 6) & 3;
	      out[outOffset + 45] = (i2 >>> 4) & 3;
	      out[outOffset + 46] = (i2 >>> 2) & 3;
	      out[outOffset + 47] = i2 & 3;
	      out[outOffset + 48] = (i3 >>> 30);
	      out[outOffset + 49] = (i3 >>> 28) & 3;
	      out[outOffset + 50] = (i3 >>> 26) & 3;
	      out[outOffset + 51] = (i3 >>> 24) & 3;
	      out[outOffset + 52] = (i3 >>> 22) & 3;
	      out[outOffset + 53] = (i3 >>> 20) & 3;
	      out[outOffset + 54] = (i3 >>> 18) & 3;
	      out[outOffset + 55] = (i3 >>> 16) & 3;
	      out[outOffset + 56] = (i3 >>> 14) & 3;
	      out[outOffset + 57] = (i3 >>> 12) & 3;
	      out[outOffset + 58] = (i3 >>> 10) & 3;
	      out[outOffset + 59] = (i3 >>> 8) & 3;
	      out[outOffset + 60] = (i3 >>> 6) & 3;
	      out[outOffset + 61] = (i3 >>> 4) & 3;
	      out[outOffset + 62] = (i3 >>> 2) & 3;
	      out[outOffset + 63] = i3 & 3;
		
		inpos.add(17);
		outpos.add(64);
	}

	//1 3bits
	protected static void fastunpack48(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 29);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 3bits
	protected static void fastunpack49(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
		
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 3bits
	protected static void fastunpack50(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
		
		inpos.add(3);
		outpos.add(3);
	}
	
	//4 3bits
	protected static void fastunpack51(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
		
		inpos.add(3);
		outpos.add(4);
	}
	
	//5 3bits
	protected static void fastunpack52(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) ;

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
		
		inpos.add(3);
		outpos.add(5);
	}
	
	//6 3bits
	protected static void fastunpack53(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);
	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
		
		inpos.add(4);
		outpos.add(6);
	}
	
	//7 3bits
	protected static void fastunpack54(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);
	      
	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
		
		inpos.add(4);
		outpos.add(7);
	}
	
	//8 3bits
	protected static void fastunpack55(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
		
		inpos.add(4);
		outpos.add(8);
	}
	
	//9 3bits
	protected static void fastunpack56(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
		
		inpos.add(5);
		outpos.add(9);
	}
	
	//10 3bits
	protected static void fastunpack57(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
		
		inpos.add(5);
		outpos.add(10);
	}
	
	//11 3bits
	protected static void fastunpack58(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
		
		inpos.add(6);
		outpos.add(11);
	}
	
	//12 3bits
	protected static void fastunpack59(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
	      out[outOffset + 11] = (i1 >>> 28) & 7;
		
		inpos.add(6);
		outpos.add(12);
	}
	
	//14 3bits
	protected static void fastunpack60(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
	      out[outOffset + 11] = (i1 >>> 28) & 7;
	      out[outOffset + 12] = (i1 >>> 25) & 7;
	      out[outOffset + 13] = (i1 >>> 22) & 7;
		
		inpos.add(7);
		outpos.add(14);
	}
	
	//16 3bits
	protected static void fastunpack61(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
	      out[outOffset + 11] = (i1 >>> 28) & 7;
	      out[outOffset + 12] = (i1 >>> 25) & 7;
	      out[outOffset + 13] = (i1 >>> 22) & 7;
	      out[outOffset + 14] = (i1 >>> 19) & 7;
	      out[outOffset + 15] = (i1 >>> 16) & 7;
		
		inpos.add(7);
		outpos.add(16);
	}
	
	//32 3bits
	protected static void fastunpack62(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
	      out[outOffset + 11] = (i1 >>> 28) & 7;
	      out[outOffset + 12] = (i1 >>> 25) & 7;
	      out[outOffset + 13] = (i1 >>> 22) & 7;
	      out[outOffset + 14] = (i1 >>> 19) & 7;
	      out[outOffset + 15] = (i1 >>> 16) & 7;
	      out[outOffset + 16] = (i1 >>> 13) & 7;
	      out[outOffset + 17] = (i1 >>> 10) & 7;
	      out[outOffset + 18] = (i1 >>> 7) & 7;
	      out[outOffset + 19] = (i1 >>> 4) & 7;
	      out[outOffset + 20] = (i1 >>> 1) & 7;
	      out[outOffset + 21] = ((i1 << 2) | (i2 >>> 30)) & 7;
	      out[outOffset + 22] = (i2 >>> 27) & 7;
	      out[outOffset + 23] = (i2 >>> 24) & 7;
	      out[outOffset + 24] = (i2 >>> 21) & 7;
	      out[outOffset + 25] = (i2 >>> 18) & 7;
	      out[outOffset + 26] = (i2 >>> 15) & 7;
	      out[outOffset + 27] = (i2 >>> 12) & 7;
	      out[outOffset + 28] = (i2 >>> 9) & 7;
	      out[outOffset + 29] = (i2 >>> 6) & 7;
	      out[outOffset + 30] = (i2 >>> 3) & 7;
	      out[outOffset + 31] = i2 & 7;
		
		inpos.add(13);
		outpos.add(32);
	}
	
	//64 3bits
	protected static void fastunpack63(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 29);
	      out[outOffset + 1] = (i0 >>> 26) & 7;
	      out[outOffset + 2] = (i0 >>> 23) & 7;
	      out[outOffset + 3] = (i0 >>> 20) & 7;
	      out[outOffset + 4] = (i0 >>> 17) & 7;
	      out[outOffset + 5] = (i0 >>> 14) & 7;
	      out[outOffset + 6] = (i0 >>> 11) & 7;
	      out[outOffset + 7] = (i0 >>> 8) & 7;
	      out[outOffset + 8] = (i0 >>> 5) & 7;
	      out[outOffset + 9] = (i0 >>> 2) & 7;
	      out[outOffset + 10] = ((i0 << 1) | (i1 >>> 31)) & 7;
	      out[outOffset + 11] = (i1 >>> 28) & 7;
	      out[outOffset + 12] = (i1 >>> 25) & 7;
	      out[outOffset + 13] = (i1 >>> 22) & 7;
	      out[outOffset + 14] = (i1 >>> 19) & 7;
	      out[outOffset + 15] = (i1 >>> 16) & 7;
	      out[outOffset + 16] = (i1 >>> 13) & 7;
	      out[outOffset + 17] = (i1 >>> 10) & 7;
	      out[outOffset + 18] = (i1 >>> 7) & 7;
	      out[outOffset + 19] = (i1 >>> 4) & 7;
	      out[outOffset + 20] = (i1 >>> 1) & 7;
	      out[outOffset + 21] = ((i1 << 2) | (i2 >>> 30)) & 7;
	      out[outOffset + 22] = (i2 >>> 27) & 7;
	      out[outOffset + 23] = (i2 >>> 24) & 7;
	      out[outOffset + 24] = (i2 >>> 21) & 7;
	      out[outOffset + 25] = (i2 >>> 18) & 7;
	      out[outOffset + 26] = (i2 >>> 15) & 7;
	      out[outOffset + 27] = (i2 >>> 12) & 7;
	      out[outOffset + 28] = (i2 >>> 9) & 7;
	      out[outOffset + 29] = (i2 >>> 6) & 7;
	      out[outOffset + 30] = (i2 >>> 3) & 7;
	      out[outOffset + 31] = i2 & 7;
	      
	      out[outOffset + 32] = (i3 >>> 29);
	      out[outOffset + 33] = (i3 >>> 26) & 7;
	      out[outOffset + 34] = (i3 >>> 23) & 7;
	      out[outOffset + 35] = (i3 >>> 20) & 7;
	      out[outOffset + 36] = (i3 >>> 17) & 7;
	      out[outOffset + 37] = (i3 >>> 14) & 7;
	      out[outOffset + 38] = (i3 >>> 11) & 7;
	      out[outOffset + 39] = (i3 >>> 8) & 7;
	      out[outOffset + 40] = (i3 >>> 5) & 7;
	      out[outOffset + 41] = (i3 >>> 2) & 7;
	      out[outOffset + 42] = ((i3 << 1) | (i4 >>> 31)) & 7;
	      out[outOffset + 43] = (i4 >>> 28) & 7;
	      out[outOffset + 44] = (i4 >>> 25) & 7;
	      out[outOffset + 45] = (i4 >>> 22) & 7;
	      out[outOffset + 46] = (i4 >>> 19) & 7;
	      out[outOffset + 47] = (i4 >>> 16) & 7;
	      out[outOffset + 48] = (i4 >>> 13) & 7;
	      out[outOffset + 49] = (i4 >>> 10) & 7;
	      out[outOffset + 50] = (i4 >>> 7) & 7;
	      out[outOffset + 51] = (i4 >>> 4) & 7;
	      out[outOffset + 52] = (i4 >>> 1) & 7;
	      out[outOffset + 53] = ((i4 << 2) | (i5 >>> 30)) & 7;
	      out[outOffset + 54] = (i5 >>> 27) & 7;
	      out[outOffset + 55] = (i5 >>> 24) & 7;
	      out[outOffset + 56] = (i5 >>> 21) & 7;
	      out[outOffset + 57] = (i5 >>> 18) & 7;
	      out[outOffset + 58] = (i5 >>> 15) & 7;
	      out[outOffset + 59] = (i5 >>> 12) & 7;
	      out[outOffset + 60] = (i5 >>> 9) & 7;
	      out[outOffset + 61] = (i5 >>> 6) & 7;
	      out[outOffset + 62] = (i5 >>> 3) & 7;
	      out[outOffset + 63] = i5 & 7;
		
		inpos.add(25);
		outpos.add(64);
	}
	
	//1 4bits
	protected static void fastunpack64(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 28);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 4bits
	protected static void fastunpack65(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
		
		inpos.add(2);
		outpos.add(2);
	}
	
	//3 4bits
	protected static void fastunpack66(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
		
		inpos.add(3);
		outpos.add(3);
	}
	
	//4 4bits
	protected static void fastunpack67(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
		
		inpos.add(3);
		outpos.add(4);
	}
	
	//5 4bits
	protected static void fastunpack68(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
		
		inpos.add(4);
		outpos.add(5);
	}
	
	//6 4bits
	protected static void fastunpack69(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
		
		inpos.add(4);
		outpos.add(6);
	}
	
	//7 4bits
	protected static void fastunpack70(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
		
		inpos.add(5);
		outpos.add(7);
	}
	
	//8 4bits
	protected static void fastunpack71(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
		
		inpos.add(5);
		outpos.add(8);
	}
	
	//9 4bits
	protected static void fastunpack72(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
		
		inpos.add(6);
		outpos.add(9);
	}
	
	//10 4bits
	protected static void fastunpack73(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
		
		inpos.add(6);
		outpos.add(10);
	}
	
	//11 4bits
	protected static void fastunpack74(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
		
		inpos.add(7);
		outpos.add(11);
	}
	
	//12 4bits
	protected static void fastunpack75(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) ;

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
	      out[outOffset + 11] = (i1 >>> 16) & 15;
		
		inpos.add(7);
		outpos.add(12);
	}
	
	//14 4bits
	protected static void fastunpack76(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
	      out[outOffset + 11] = (i1 >>> 16) & 15;
	      out[outOffset + 12] = (i1 >>> 12) & 15;
	      out[outOffset + 13] = (i1 >>> 8) & 15;
		
		inpos.add(8);
		outpos.add(14);
	}
	
	//16 4bits
	protected static void fastunpack77(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
	      out[outOffset + 11] = (i1 >>> 16) & 15;
	      out[outOffset + 12] = (i1 >>> 12) & 15;
	      out[outOffset + 13] = (i1 >>> 8) & 15;
	      out[outOffset + 14] = (i1 >>> 4) & 15;
	      out[outOffset + 15] = i1 & 15;
		
		inpos.add(9);
		outpos.add(16);
	}
	
	//32 4bits
	protected static void fastunpack78(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
	      out[outOffset + 11] = (i1 >>> 16) & 15;
	      out[outOffset + 12] = (i1 >>> 12) & 15;
	      out[outOffset + 13] = (i1 >>> 8) & 15;
	      out[outOffset + 14] = (i1 >>> 4) & 15;
	      out[outOffset + 15] = i1 & 15;
	      out[outOffset + 16] = (i2 >>> 28);
	      out[outOffset + 17] = (i2 >>> 24) & 15;
	      out[outOffset + 18] = (i2 >>> 20) & 15;
	      out[outOffset + 19] = (i2 >>> 16) & 15;
	      out[outOffset + 20] = (i2 >>> 12) & 15;
	      out[outOffset + 21] = (i2 >>> 8) & 15;
	      out[outOffset + 22] = (i2 >>> 4) & 15;
	      out[outOffset + 23] = i2 & 15;
	      out[outOffset + 24] = (i3 >>> 28);
	      out[outOffset + 25] = (i3 >>> 24) & 15;
	      out[outOffset + 26] = (i3 >>> 20) & 15;
	      out[outOffset + 27] = (i3 >>> 16) & 15;
	      out[outOffset + 28] = (i3 >>> 12) & 15;
	      out[outOffset + 29] = (i3 >>> 8) & 15;
	      out[outOffset + 30] = (i3 >>> 4) & 15;
	      out[outOffset + 31] = i3 & 15;
		
		inpos.add(17);
		outpos.add(32);
	}
	
	//64 4bits
	protected static void fastunpack79(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 28);
	      out[outOffset + 1] = (i0 >>> 24) & 15;
	      out[outOffset + 2] = (i0 >>> 20) & 15;
	      out[outOffset + 3] = (i0 >>> 16) & 15;
	      out[outOffset + 4] = (i0 >>> 12) & 15;
	      out[outOffset + 5] = (i0 >>> 8) & 15;
	      out[outOffset + 6] = (i0 >>> 4) & 15;
	      out[outOffset + 7] = i0 & 15;
	      out[outOffset + 8] = (i1 >>> 28);
	      out[outOffset + 9] = (i1 >>> 24) & 15;
	      out[outOffset + 10] = (i1 >>> 20) & 15;
	      out[outOffset + 11] = (i1 >>> 16) & 15;
	      out[outOffset + 12] = (i1 >>> 12) & 15;
	      out[outOffset + 13] = (i1 >>> 8) & 15;
	      out[outOffset + 14] = (i1 >>> 4) & 15;
	      out[outOffset + 15] = i1 & 15;
	      out[outOffset + 16] = (i2 >>> 28);
	      out[outOffset + 17] = (i2 >>> 24) & 15;
	      out[outOffset + 18] = (i2 >>> 20) & 15;
	      out[outOffset + 19] = (i2 >>> 16) & 15;
	      out[outOffset + 20] = (i2 >>> 12) & 15;
	      out[outOffset + 21] = (i2 >>> 8) & 15;
	      out[outOffset + 22] = (i2 >>> 4) & 15;
	      out[outOffset + 23] = i2 & 15;
	      out[outOffset + 24] = (i3 >>> 28);
	      out[outOffset + 25] = (i3 >>> 24) & 15;
	      out[outOffset + 26] = (i3 >>> 20) & 15;
	      out[outOffset + 27] = (i3 >>> 16) & 15;
	      out[outOffset + 28] = (i3 >>> 12) & 15;
	      out[outOffset + 29] = (i3 >>> 8) & 15;
	      out[outOffset + 30] = (i3 >>> 4) & 15;
	      out[outOffset + 31] = i3 & 15;
	      
	      out[outOffset + 32] = (i4 >>> 28);
	      out[outOffset + 33] = (i4 >>> 24) & 15;
	      out[outOffset + 34] = (i4 >>> 20) & 15;
	      out[outOffset + 35] = (i4 >>> 16) & 15;
	      out[outOffset + 36] = (i4 >>> 12) & 15;
	      out[outOffset + 37] = (i4 >>> 8) & 15;
	      out[outOffset + 38] = (i4 >>> 4) & 15;
	      out[outOffset + 39] = i4 & 15;
	      out[outOffset + 40] = (i5 >>> 28);
	      out[outOffset + 41] = (i5 >>> 24) & 15;
	      out[outOffset + 42] = (i5 >>> 20) & 15;
	      out[outOffset + 43] = (i5 >>> 16) & 15;
	      out[outOffset + 44] = (i5 >>> 12) & 15;
	      out[outOffset + 45] = (i5 >>> 8) & 15;
	      out[outOffset + 46] = (i5 >>> 4) & 15;
	      out[outOffset + 47] = i5 & 15;
	      out[outOffset + 48] = (i6 >>> 28);
	      out[outOffset + 49] = (i6 >>> 24) & 15;
	      out[outOffset + 50] = (i6 >>> 20) & 15;
	      out[outOffset + 51] = (i6 >>> 16) & 15;
	      out[outOffset + 52] = (i6 >>> 12) & 15;
	      out[outOffset + 53] = (i6 >>> 8) & 15;
	      out[outOffset + 54] = (i6 >>> 4) & 15;
	      out[outOffset + 55] = i6 & 15;
	      out[outOffset + 56] = (i7 >>> 28);
	      out[outOffset + 57] = (i7 >>> 24) & 15;
	      out[outOffset + 58] = (i7 >>> 20) & 15;
	      out[outOffset + 59] = (i7 >>> 16) & 15;
	      out[outOffset + 60] = (i7 >>> 12) & 15;
	      out[outOffset + 61] = (i7 >>> 8) & 15;
	      out[outOffset + 62] = (i7 >>> 4) & 15;
	      out[outOffset + 63] = i7 & 15;
		
		inpos.add(33);
		outpos.add(64);
	}

	//1 5bits
	protected static void fastunpack80(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 27);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 5bits
	protected static void fastunpack81(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
		
		inpos.add(3);
		outpos.add(2);
	}
	
	//3 5bits
	protected static void fastunpack82(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
		
		inpos.add(3);
		outpos.add(3);
	}
	
	//4 5bits
	protected static void fastunpack83(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;

		inpos.add(4);
		outpos.add(4);
	}
	
	//5 5bits
	protected static void fastunpack84(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;

		inpos.add(5);
		outpos.add(5);
	}
	
	//6 5bits
	protected static void fastunpack85(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
		
		inpos.add(5);
		outpos.add(6);
	}
	
	//7 5bits
	protected static void fastunpack86(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
		
		inpos.add(6);
		outpos.add(7);
	}
	
	//8 5bits
	protected static void fastunpack87(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
		
		inpos.add(6);
		outpos.add(8);
	}
	
	//9 5bits
	protected static void fastunpack88(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;

		inpos.add(7);
		outpos.add(9);
	}
	
	//10 5bits
	protected static void fastunpack89(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;

		inpos.add(8);
		outpos.add(10);
	}
	
	//11 5bits
	protected static void fastunpack90(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
		
		inpos.add(8);
		outpos.add(11);
	}
	
	//12 5bits
	protected static void fastunpack91(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
	      out[outOffset + 11] = (i1 >>> 4) & 31;
		
		inpos.add(9);
		outpos.add(12);
	}
	
	//14 5bits
	protected static void fastunpack92(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
	      out[outOffset + 11] = (i1 >>> 4) & 31;
	      out[outOffset + 12] = ((i1 << 1) | (i2 >>> 31)) & 31;
	      out[outOffset + 13] = (i2 >>> 26) & 31;
		
		inpos.add(10);
		outpos.add(14);
	}
	
	//16 5bits
	protected static void fastunpack93(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
	      out[outOffset + 11] = (i1 >>> 4) & 31;
	      out[outOffset + 12] = ((i1 << 1) | (i2 >>> 31)) & 31;
	      out[outOffset + 13] = (i2 >>> 26) & 31;
	      out[outOffset + 14] = (i2 >>> 21) & 31;
	      out[outOffset + 15] = (i2 >>> 16) & 31;
		
		inpos.add(11);
		outpos.add(16);
	}
	
	//32 5bits
	protected static void fastunpack94(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
	      out[outOffset + 11] = (i1 >>> 4) & 31;
	      out[outOffset + 12] = ((i1 << 1) | (i2 >>> 31)) & 31;
	      out[outOffset + 13] = (i2 >>> 26) & 31;
	      out[outOffset + 14] = (i2 >>> 21) & 31;
	      out[outOffset + 15] = (i2 >>> 16) & 31;
	      out[outOffset + 16] = (i2 >>> 11) & 31;
	      out[outOffset + 17] = (i2 >>> 6) & 31;
	      out[outOffset + 18] = (i2 >>> 1) & 31;
	      out[outOffset + 19] = ((i2 << 4) | (i3 >>> 28)) & 31;
	      out[outOffset + 20] = (i3 >>> 23) & 31;
	      out[outOffset + 21] = (i3 >>> 18) & 31;
	      out[outOffset + 22] = (i3 >>> 13) & 31;
	      out[outOffset + 23] = (i3 >>> 8) & 31;
	      out[outOffset + 24] = (i3 >>> 3) & 31;
	      out[outOffset + 25] = ((i3 << 2) | (i4 >>> 30)) & 31;
	      out[outOffset + 26] = (i4 >>> 25) & 31;
	      out[outOffset + 27] = (i4 >>> 20) & 31;
	      out[outOffset + 28] = (i4 >>> 15) & 31;
	      out[outOffset + 29] = (i4 >>> 10) & 31;
	      out[outOffset + 30] = (i4 >>> 5) & 31;
	      out[outOffset + 31] = i4 & 31;
		
		inpos.add(21);
		outpos.add(32);
	}
	
	//64 5bits
	protected static void fastunpack95(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 27);
	      out[outOffset + 1] = (i0 >>> 22) & 31;
	      out[outOffset + 2] = (i0 >>> 17) & 31;
	      out[outOffset + 3] = (i0 >>> 12) & 31;
	      out[outOffset + 4] = (i0 >>> 7) & 31;
	      out[outOffset + 5] = (i0 >>> 2) & 31;
	      out[outOffset + 6] = ((i0 << 3) | (i1 >>> 29)) & 31;
	      out[outOffset + 7] = (i1 >>> 24) & 31;
	      out[outOffset + 8] = (i1 >>> 19) & 31;
	      out[outOffset + 9] = (i1 >>> 14) & 31;
	      out[outOffset + 10] = (i1 >>> 9) & 31;
	      out[outOffset + 11] = (i1 >>> 4) & 31;
	      out[outOffset + 12] = ((i1 << 1) | (i2 >>> 31)) & 31;
	      out[outOffset + 13] = (i2 >>> 26) & 31;
	      out[outOffset + 14] = (i2 >>> 21) & 31;
	      out[outOffset + 15] = (i2 >>> 16) & 31;
	      out[outOffset + 16] = (i2 >>> 11) & 31;
	      out[outOffset + 17] = (i2 >>> 6) & 31;
	      out[outOffset + 18] = (i2 >>> 1) & 31;
	      out[outOffset + 19] = ((i2 << 4) | (i3 >>> 28)) & 31;
	      out[outOffset + 20] = (i3 >>> 23) & 31;
	      out[outOffset + 21] = (i3 >>> 18) & 31;
	      out[outOffset + 22] = (i3 >>> 13) & 31;
	      out[outOffset + 23] = (i3 >>> 8) & 31;
	      out[outOffset + 24] = (i3 >>> 3) & 31;
	      out[outOffset + 25] = ((i3 << 2) | (i4 >>> 30)) & 31;
	      out[outOffset + 26] = (i4 >>> 25) & 31;
	      out[outOffset + 27] = (i4 >>> 20) & 31;
	      out[outOffset + 28] = (i4 >>> 15) & 31;
	      out[outOffset + 29] = (i4 >>> 10) & 31;
	      out[outOffset + 30] = (i4 >>> 5) & 31;
	      out[outOffset + 31] = i4 & 31;
	      
	      out[outOffset + 32] = (i5 >>> 27);
	      out[outOffset + 33] = (i5 >>> 22) & 31;
	      out[outOffset + 34] = (i5 >>> 17) & 31;
	      out[outOffset + 35] = (i5 >>> 12) & 31;
	      out[outOffset + 36] = (i5 >>> 7) & 31;
	      out[outOffset + 37] = (i5 >>> 2) & 31;
	      out[outOffset + 38] = ((i5 << 3) | (i6 >>> 29)) & 31;
	      out[outOffset + 39] = (i6 >>> 24) & 31;
	      out[outOffset + 40] = (i6 >>> 19) & 31;
	      out[outOffset + 41] = (i6 >>> 14) & 31;
	      out[outOffset + 42] = (i6 >>> 9) & 31;
	      out[outOffset + 43] = (i6 >>> 4) & 31;
	      out[outOffset + 44] = ((i6 << 1) | (i7 >>> 31)) & 31;
	      out[outOffset + 45] = (i7 >>> 26) & 31;
	      out[outOffset + 46] = (i7 >>> 21) & 31;
	      out[outOffset + 47] = (i7 >>> 16) & 31;
	      out[outOffset + 48] = (i7 >>> 11) & 31;
	      out[outOffset + 49] = (i7 >>> 6) & 31;
	      out[outOffset + 50] = (i7 >>> 1) & 31;
	      out[outOffset + 51] = ((i7 << 4) | (i8 >>> 28)) & 31;
	      out[outOffset + 52] = (i8 >>> 23) & 31;
	      out[outOffset + 53] = (i8 >>> 18) & 31;
	      out[outOffset + 54] = (i8 >>> 13) & 31;
	      out[outOffset + 55] = (i8 >>> 8) & 31;
	      out[outOffset + 56] = (i8 >>> 3) & 31;
	      out[outOffset + 57] = ((i8 << 2) | (i9 >>> 30)) & 31;
	      out[outOffset + 58] = (i9 >>> 25) & 31;
	      out[outOffset + 59] = (i9 >>> 20) & 31;
	      out[outOffset + 60] = (i9 >>> 15) & 31;
	      out[outOffset + 61] = (i9 >>> 10) & 31;
	      out[outOffset + 62] = (i9 >>> 5) & 31;
	      out[outOffset + 63] = i9 & 31;
		
		inpos.add(41);
		outpos.add(64);
	}

	//1 6bits
	protected static void fastunpack96(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 26);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 6bits
	protected static void fastunpack97(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
		
		inpos.add(3);
		outpos.add(2);
	}
	
	//3 6bits
	protected static void fastunpack98(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
		
		inpos.add(4);
		outpos.add(3);
	}
	
	//4 6bits
	protected static void fastunpack99(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
		
		inpos.add(4);
		outpos.add(4);
	}
	
	//5 6bits
	protected static void fastunpack100(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
		
		inpos.add(5);
		outpos.add(5);
	}
	
	//6 6bits
	protected static void fastunpack101(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);
	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
		
		inpos.add(6);
		outpos.add(6);
	}
	
	//7 6bits
	protected static void fastunpack102(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
		
		inpos.add(7);
		outpos.add(7);
	}
	
	//8 6bits
	protected static void fastunpack103(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
		
		inpos.add(7);
		outpos.add(8);
	}
	
	//9 6bits
	protected static void fastunpack104(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
		
		inpos.add(8);
		outpos.add(9);
	}
	
	//10 6bits
	protected static void fastunpack105(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
		
		inpos.add(9);
		outpos.add(10);
	}
	
	//11 6bits
	protected static void fastunpack106(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
		
		inpos.add(10);
		outpos.add(11);
	}
	
	//12 6bits
	protected static void fastunpack107(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
	      out[outOffset + 11] = (i2 >>> 24) & 63;
		
		inpos.add(10);
		outpos.add(12);
	}
	
	//14 6bits
	protected static void fastunpack108(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
	      out[outOffset + 11] = (i2 >>> 24) & 63;
	      out[outOffset + 12] = (i2 >>> 18) & 63;
	      out[outOffset + 13] = (i2 >>> 12) & 63;
		
		inpos.add(12);
		outpos.add(14);
	}
	
	//16 6bits
	protected static void fastunpack109(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
	      out[outOffset + 11] = (i2 >>> 24) & 63;
	      out[outOffset + 12] = (i2 >>> 18) & 63;
	      out[outOffset + 13] = (i2 >>> 12) & 63;
	      out[outOffset + 14] = (i2 >>> 6) & 63;
	      out[outOffset + 15] = i2 & 63;
		
		inpos.add(13);
		outpos.add(16);
	}
	
	//32 6bits
	protected static void fastunpack110(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
	      out[outOffset + 11] = (i2 >>> 24) & 63;
	      out[outOffset + 12] = (i2 >>> 18) & 63;
	      out[outOffset + 13] = (i2 >>> 12) & 63;
	      out[outOffset + 14] = (i2 >>> 6) & 63;
	      out[outOffset + 15] = i2 & 63;
	      out[outOffset + 16] = (i3 >>> 26);
	      out[outOffset + 17] = (i3 >>> 20) & 63;
	      out[outOffset + 18] = (i3 >>> 14) & 63;
	      out[outOffset + 19] = (i3 >>> 8) & 63;
	      out[outOffset + 20] = (i3 >>> 2) & 63;
	      out[outOffset + 21] = ((i3 << 4) | (i4 >>> 28)) & 63;
	      out[outOffset + 22] = (i4 >>> 22) & 63;
	      out[outOffset + 23] = (i4 >>> 16) & 63;
	      out[outOffset + 24] = (i4 >>> 10) & 63;
	      out[outOffset + 25] = (i4 >>> 4) & 63;
	      out[outOffset + 26] = ((i4 << 2) | (i5 >>> 30)) & 63;
	      out[outOffset + 27] = (i5 >>> 24) & 63;
	      out[outOffset + 28] = (i5 >>> 18) & 63;
	      out[outOffset + 29] = (i5 >>> 12) & 63;
	      out[outOffset + 30] = (i5 >>> 6) & 63;
	      out[outOffset + 31] = i5 & 63;
		
		inpos.add(25);
		outpos.add(32);
	}
	
	//64 6bits
	protected static void fastunpack111(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 26);
	      out[outOffset + 1] = (i0 >>> 20) & 63;
	      out[outOffset + 2] = (i0 >>> 14) & 63;
	      out[outOffset + 3] = (i0 >>> 8) & 63;
	      out[outOffset + 4] = (i0 >>> 2) & 63;
	      out[outOffset + 5] = ((i0 << 4) | (i1 >>> 28)) & 63;
	      out[outOffset + 6] = (i1 >>> 22) & 63;
	      out[outOffset + 7] = (i1 >>> 16) & 63;
	      out[outOffset + 8] = (i1 >>> 10) & 63;
	      out[outOffset + 9] = (i1 >>> 4) & 63;
	      out[outOffset + 10] = ((i1 << 2) | (i2 >>> 30)) & 63;
	      out[outOffset + 11] = (i2 >>> 24) & 63;
	      out[outOffset + 12] = (i2 >>> 18) & 63;
	      out[outOffset + 13] = (i2 >>> 12) & 63;
	      out[outOffset + 14] = (i2 >>> 6) & 63;
	      out[outOffset + 15] = i2 & 63;
	      out[outOffset + 16] = (i3 >>> 26);
	      out[outOffset + 17] = (i3 >>> 20) & 63;
	      out[outOffset + 18] = (i3 >>> 14) & 63;
	      out[outOffset + 19] = (i3 >>> 8) & 63;
	      out[outOffset + 20] = (i3 >>> 2) & 63;
	      out[outOffset + 21] = ((i3 << 4) | (i4 >>> 28)) & 63;
	      out[outOffset + 22] = (i4 >>> 22) & 63;
	      out[outOffset + 23] = (i4 >>> 16) & 63;
	      out[outOffset + 24] = (i4 >>> 10) & 63;
	      out[outOffset + 25] = (i4 >>> 4) & 63;
	      out[outOffset + 26] = ((i4 << 2) | (i5 >>> 30)) & 63;
	      out[outOffset + 27] = (i5 >>> 24) & 63;
	      out[outOffset + 28] = (i5 >>> 18) & 63;
	      out[outOffset + 29] = (i5 >>> 12) & 63;
	      out[outOffset + 30] = (i5 >>> 6) & 63;
	      out[outOffset + 31] = i5 & 63;
	      
	      out[outOffset + 32] = (i6 >>> 26);
	      out[outOffset + 33] = (i6 >>> 20) & 63;
	      out[outOffset + 34] = (i6 >>> 14) & 63;
	      out[outOffset + 35] = (i6 >>> 8) & 63;
	      out[outOffset + 36] = (i6 >>> 2) & 63;
	      out[outOffset + 37] = ((i6 << 4) | (i7 >>> 28)) & 63;
	      out[outOffset + 38] = (i7 >>> 22) & 63;
	      out[outOffset + 39] = (i7 >>> 16) & 63;
	      out[outOffset + 40] = (i7 >>> 10) & 63;
	      out[outOffset + 41] = (i7 >>> 4) & 63;
	      out[outOffset + 42] = ((i7 << 2) | (i8 >>> 30)) & 63;
	      out[outOffset + 43] = (i8 >>> 24) & 63;
	      out[outOffset + 44] = (i8 >>> 18) & 63;
	      out[outOffset + 45] = (i8 >>> 12) & 63;
	      out[outOffset + 46] = (i8 >>> 6) & 63;
	      out[outOffset + 47] = i8 & 63;
	      out[outOffset + 48] = (i9 >>> 26);
	      out[outOffset + 49] = (i9 >>> 20) & 63;
	      out[outOffset + 50] = (i9 >>> 14) & 63;
	      out[outOffset + 51] = (i9 >>> 8) & 63;
	      out[outOffset + 52] = (i9 >>> 2) & 63;
	      out[outOffset + 53] = ((i9 << 4) | (i10 >>> 28)) & 63;
	      out[outOffset + 54] = (i10 >>> 22) & 63;
	      out[outOffset + 55] = (i10 >>> 16) & 63;
	      out[outOffset + 56] = (i10 >>> 10) & 63;
	      out[outOffset + 57] = (i10 >>> 4) & 63;
	      out[outOffset + 58] = ((i10 << 2) | (i11 >>> 30)) & 63;
	      out[outOffset + 59] = (i11 >>> 24) & 63;
	      out[outOffset + 60] = (i11 >>> 18) & 63;
	      out[outOffset + 61] = (i11 >>> 12) & 63;
	      out[outOffset + 62] = (i11 >>> 6) & 63;
	      out[outOffset + 63] = i11 & 63;
		
		inpos.add(49);
		outpos.add(64);
	}
	
	//1 7bits
	protected static void fastunpack112(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 25);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 7bits
	protected static void fastunpack113(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);
	      
	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
		
		inpos.add(3);
		outpos.add(2);
	}
	
	//3 7bits
	protected static void fastunpack114(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
		
		inpos.add(4);
		outpos.add(3);
	}
	
	//4 7bits
	protected static void fastunpack115(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
		
		inpos.add(5);
		outpos.add(4);
	}
	
	//5 7bits
	protected static void fastunpack116(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);


	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
		
		inpos.add(6);
		outpos.add(5);
	}
	
	//6 7bits
	protected static void fastunpack117(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
		
		inpos.add(7);
		outpos.add(6);
	}
	
	//7 7bits
	protected static void fastunpack118(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
		
		inpos.add(8);
		outpos.add(7);
	}
	
	//8 7bits
	protected static void fastunpack119(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
		
		inpos.add(8);
		outpos.add(8);
	}
	
	//9 7bits
	protected static void fastunpack120(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
		
		inpos.add(9);
		outpos.add(9);
	}
	
	//10 7bits
	protected static void fastunpack121(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);


	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
		
		inpos.add(10);
		outpos.add(10);
	}
	
	//11 7bits
	protected static void fastunpack122(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
		
		inpos.add(11);
		outpos.add(11);
	}
	
	//12 7bits
	protected static void fastunpack123(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
	      out[outOffset + 11] = (i2 >>> 12) & 127;
		
		inpos.add(12);
		outpos.add(12);
	}
	
	//14 7bits
	protected static void fastunpack124(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
	      out[outOffset + 11] = (i2 >>> 12) & 127;
	      out[outOffset + 12] = (i2 >>> 5) & 127;
	      out[outOffset + 13] = ((i2 << 2) | (i3 >>> 30)) & 127;
		
		inpos.add(14);
		outpos.add(14);
	}
	
	//16 7bits
	protected static void fastunpack125(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
	      out[outOffset + 11] = (i2 >>> 12) & 127;
	      out[outOffset + 12] = (i2 >>> 5) & 127;
	      out[outOffset + 13] = ((i2 << 2) | (i3 >>> 30)) & 127;
	      out[outOffset + 14] = (i3 >>> 23) & 127;
	      out[outOffset + 15] = (i3 >>> 16) & 127;
		
		inpos.add(15);
		outpos.add(16);
	}
	
	//32 7bits
	protected static void fastunpack126(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
	      out[outOffset + 11] = (i2 >>> 12) & 127;
	      out[outOffset + 12] = (i2 >>> 5) & 127;
	      out[outOffset + 13] = ((i2 << 2) | (i3 >>> 30)) & 127;
	      out[outOffset + 14] = (i3 >>> 23) & 127;
	      out[outOffset + 15] = (i3 >>> 16) & 127;
	      out[outOffset + 16] = (i3 >>> 9) & 127;
	      out[outOffset + 17] = (i3 >>> 2) & 127;
	      out[outOffset + 18] = ((i3 << 5) | (i4 >>> 27)) & 127;
	      out[outOffset + 19] = (i4 >>> 20) & 127;
	      out[outOffset + 20] = (i4 >>> 13) & 127;
	      out[outOffset + 21] = (i4 >>> 6) & 127;
	      out[outOffset + 22] = ((i4 << 1) | (i5 >>> 31)) & 127;
	      out[outOffset + 23] = (i5 >>> 24) & 127;
	      out[outOffset + 24] = (i5 >>> 17) & 127;
	      out[outOffset + 25] = (i5 >>> 10) & 127;
	      out[outOffset + 26] = (i5 >>> 3) & 127;
	      out[outOffset + 27] = ((i5 << 4) | (i6 >>> 28)) & 127;
	      out[outOffset + 28] = (i6 >>> 21) & 127;
	      out[outOffset + 29] = (i6 >>> 14) & 127;
	      out[outOffset + 30] = (i6 >>> 7) & 127;
	      out[outOffset + 31] = i6 & 127;
		
		inpos.add(29);
		outpos.add(32);
	}
	
	//64 7bits
	protected static void fastunpack127(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 25);
	      out[outOffset + 1] = (i0 >>> 18) & 127;
	      out[outOffset + 2] = (i0 >>> 11) & 127;
	      out[outOffset + 3] = (i0 >>> 4) & 127;
	      out[outOffset + 4] = ((i0 << 3) | (i1 >>> 29)) & 127;
	      out[outOffset + 5] = (i1 >>> 22) & 127;
	      out[outOffset + 6] = (i1 >>> 15) & 127;
	      out[outOffset + 7] = (i1 >>> 8) & 127;
	      out[outOffset + 8] = (i1 >>> 1) & 127;
	      out[outOffset + 9] = ((i1 << 6) | (i2 >>> 26)) & 127;
	      out[outOffset + 10] = (i2 >>> 19) & 127;
	      out[outOffset + 11] = (i2 >>> 12) & 127;
	      out[outOffset + 12] = (i2 >>> 5) & 127;
	      out[outOffset + 13] = ((i2 << 2) | (i3 >>> 30)) & 127;
	      out[outOffset + 14] = (i3 >>> 23) & 127;
	      out[outOffset + 15] = (i3 >>> 16) & 127;
	      out[outOffset + 16] = (i3 >>> 9) & 127;
	      out[outOffset + 17] = (i3 >>> 2) & 127;
	      out[outOffset + 18] = ((i3 << 5) | (i4 >>> 27)) & 127;
	      out[outOffset + 19] = (i4 >>> 20) & 127;
	      out[outOffset + 20] = (i4 >>> 13) & 127;
	      out[outOffset + 21] = (i4 >>> 6) & 127;
	      out[outOffset + 22] = ((i4 << 1) | (i5 >>> 31)) & 127;
	      out[outOffset + 23] = (i5 >>> 24) & 127;
	      out[outOffset + 24] = (i5 >>> 17) & 127;
	      out[outOffset + 25] = (i5 >>> 10) & 127;
	      out[outOffset + 26] = (i5 >>> 3) & 127;
	      out[outOffset + 27] = ((i5 << 4) | (i6 >>> 28)) & 127;
	      out[outOffset + 28] = (i6 >>> 21) & 127;
	      out[outOffset + 29] = (i6 >>> 14) & 127;
	      out[outOffset + 30] = (i6 >>> 7) & 127;
	      out[outOffset + 31] = i6 & 127;
	      
	      out[outOffset + 32] = (i7 >>> 25);
	      out[outOffset + 33] = (i7 >>> 18) & 127;
	      out[outOffset + 34] = (i7 >>> 11) & 127;
	      out[outOffset + 35] = (i7 >>> 4) & 127;
	      out[outOffset + 36] = ((i7 << 3) | (i8 >>> 29)) & 127;
	      out[outOffset + 37] = (i8 >>> 22) & 127;
	      out[outOffset + 38] = (i8 >>> 15) & 127;
	      out[outOffset + 39] = (i8 >>> 8) & 127;
	      out[outOffset + 40] = (i8 >>> 1) & 127;
	      out[outOffset + 41] = ((i8 << 6) | (i9 >>> 26)) & 127;
	      out[outOffset + 42] = (i9 >>> 19) & 127;
	      out[outOffset + 43] = (i9 >>> 12) & 127;
	      out[outOffset + 44] = (i9 >>> 5) & 127;
	      out[outOffset + 45] = ((i9 << 2) | (i10 >>> 30)) & 127;
	      out[outOffset + 46] = (i10 >>> 23) & 127;
	      out[outOffset + 47] = (i10 >>> 16) & 127;
	      out[outOffset + 48] = (i10 >>> 9) & 127;
	      out[outOffset + 49] = (i10 >>> 2) & 127;
	      out[outOffset + 50] = ((i10 << 5) | (i11 >>> 27)) & 127;
	      out[outOffset + 51] = (i11 >>> 20) & 127;
	      out[outOffset + 52] = (i11 >>> 13) & 127;
	      out[outOffset + 53] = (i11 >>> 6) & 127;
	      out[outOffset + 54] = ((i11 << 1) | (i12 >>> 31)) & 127;
	      out[outOffset + 55] = (i12 >>> 24) & 127;
	      out[outOffset + 56] = (i12 >>> 17) & 127;
	      out[outOffset + 57] = (i12 >>> 10) & 127;
	      out[outOffset + 58] = (i12 >>> 3) & 127;
	      out[outOffset + 59] = ((i12 << 4) | (i13 >>> 28)) & 127;
	      out[outOffset + 60] = (i13 >>> 21) & 127;
	      out[outOffset + 61] = (i13 >>> 14) & 127;
	      out[outOffset + 62] = (i13 >>> 7) & 127;
	      out[outOffset + 63] = i13 & 127;
		
		inpos.add(57);
		outpos.add(64);
	}

	//1 8bits
	protected static void fastunpack128(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 24);
		
		inpos.add(2);
		outpos.add(1);
	}
	
	//2 8bits
	protected static void fastunpack129(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
		
		inpos.add(3);
		outpos.add(2);
	}
	
	//3 8bits
	protected static void fastunpack130(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);


	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
		
		inpos.add(4);
		outpos.add(3);
	}
	
	//4 8bits
	protected static void fastunpack131(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
		
		inpos.add(5);
		outpos.add(4);
	}
	
	//5 8bits
	protected static void fastunpack132(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
		
		inpos.add(6);
		outpos.add(5);
	}
	
	//6 8bits
	protected static void fastunpack133(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
		
		inpos.add(7);
		outpos.add(6);
	}
	
	//7 8bits
	protected static void fastunpack134(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
		
		inpos.add(8);
		outpos.add(7);
	}
	
	//8 8bits
	protected static void fastunpack135(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
		
		inpos.add(9);
		outpos.add(8);
	}
	
	//9 8bits
	protected static void fastunpack136(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
		
		inpos.add(10);
		outpos.add(9);
	}
	
	//10 8bits
	protected static void fastunpack137(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
		
		inpos.add(11);
		outpos.add(10);
	}
	
	//11 8bits
	protected static void fastunpack138(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
		
		inpos.add(12);
		outpos.add(11);
	}
	
	//12 8bits
	protected static void fastunpack139(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
	      out[outOffset + 11] = i2 & 255;
		
		inpos.add(13);
		outpos.add(12);
	}
	
	//14 8bits
	protected static void fastunpack140(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
	      out[outOffset + 11] = i2 & 255;
	      out[outOffset + 12] = (i3 >>> 24);
	      out[outOffset + 13] = (i3 >>> 16) & 255;
		
		inpos.add(15);
		outpos.add(14);
	}
	
	//16 8bits
	protected static void fastunpack141(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
	      out[outOffset + 11] = i2 & 255;
	      out[outOffset + 12] = (i3 >>> 24);
	      out[outOffset + 13] = (i3 >>> 16) & 255;
	      out[outOffset + 14] = (i3 >>> 8) & 255;
	      out[outOffset + 15] = i3 & 255;
		
		inpos.add(17);
		outpos.add(16);
	}
	
	//32 8bits
	protected static void fastunpack142(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
	      out[outOffset + 11] = i2 & 255;
	      out[outOffset + 12] = (i3 >>> 24);
	      out[outOffset + 13] = (i3 >>> 16) & 255;
	      out[outOffset + 14] = (i3 >>> 8) & 255;
	      out[outOffset + 15] = i3 & 255;
	      out[outOffset + 16] = (i4 >>> 24);
	      out[outOffset + 17] = (i4 >>> 16) & 255;
	      out[outOffset + 18] = (i4 >>> 8) & 255;
	      out[outOffset + 19] = i4 & 255;
	      out[outOffset + 20] = (i5 >>> 24);
	      out[outOffset + 21] = (i5 >>> 16) & 255;
	      out[outOffset + 22] = (i5 >>> 8) & 255;
	      out[outOffset + 23] = i5 & 255;
	      out[outOffset + 24] = (i6 >>> 24);
	      out[outOffset + 25] = (i6 >>> 16) & 255;
	      out[outOffset + 26] = (i6 >>> 8) & 255;
	      out[outOffset + 27] = i6 & 255;
	      out[outOffset + 28] = (i7 >>> 24);
	      out[outOffset + 29] = (i7 >>> 16) & 255;
	      out[outOffset + 30] = (i7 >>> 8) & 255;
	      out[outOffset + 31] = i7 & 255;
		
		inpos.add(33);
		outpos.add(32);
	}
	
	//64 8bits
	protected static void fastunpack143(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 24);
	      out[outOffset + 1] = (i0 >>> 16) & 255;
	      out[outOffset + 2] = (i0 >>> 8) & 255;
	      out[outOffset + 3] = i0 & 255;
	      out[outOffset + 4] = (i1 >>> 24);
	      out[outOffset + 5] = (i1 >>> 16) & 255;
	      out[outOffset + 6] = (i1 >>> 8) & 255;
	      out[outOffset + 7] = i1 & 255;
	      out[outOffset + 8] = (i2 >>> 24);
	      out[outOffset + 9] = (i2 >>> 16) & 255;
	      out[outOffset + 10] = (i2 >>> 8) & 255;
	      out[outOffset + 11] = i2 & 255;
	      out[outOffset + 12] = (i3 >>> 24);
	      out[outOffset + 13] = (i3 >>> 16) & 255;
	      out[outOffset + 14] = (i3 >>> 8) & 255;
	      out[outOffset + 15] = i3 & 255;
	      out[outOffset + 16] = (i4 >>> 24);
	      out[outOffset + 17] = (i4 >>> 16) & 255;
	      out[outOffset + 18] = (i4 >>> 8) & 255;
	      out[outOffset + 19] = i4 & 255;
	      out[outOffset + 20] = (i5 >>> 24);
	      out[outOffset + 21] = (i5 >>> 16) & 255;
	      out[outOffset + 22] = (i5 >>> 8) & 255;
	      out[outOffset + 23] = i5 & 255;
	      out[outOffset + 24] = (i6 >>> 24);
	      out[outOffset + 25] = (i6 >>> 16) & 255;
	      out[outOffset + 26] = (i6 >>> 8) & 255;
	      out[outOffset + 27] = i6 & 255;
	      out[outOffset + 28] = (i7 >>> 24);
	      out[outOffset + 29] = (i7 >>> 16) & 255;
	      out[outOffset + 30] = (i7 >>> 8) & 255;
	      out[outOffset + 31] = i7 & 255;
	      
	      out[outOffset + 32] = (i8 >>> 24);
	      out[outOffset + 33] = (i8 >>> 16) & 255;
	      out[outOffset + 34] = (i8 >>> 8) & 255;
	      out[outOffset + 35] = i8 & 255;
	      out[outOffset + 36] = (i9 >>> 24);
	      out[outOffset + 37] = (i9 >>> 16) & 255;
	      out[outOffset + 38] = (i9 >>> 8) & 255;
	      out[outOffset + 39] = i9 & 255;
	      out[outOffset + 40] = (i10 >>> 24);
	      out[outOffset + 41] = (i10 >>> 16) & 255;
	      out[outOffset + 42] = (i10 >>> 8) & 255;
	      out[outOffset + 43] = i10 & 255;
	      out[outOffset + 44] = (i11 >>> 24);
	      out[outOffset + 45] = (i11 >>> 16) & 255;
	      out[outOffset + 46] = (i11 >>> 8) & 255;
	      out[outOffset + 47] = i11 & 255;
	      out[outOffset + 48] = (i12 >>> 24);
	      out[outOffset + 49] = (i12 >>> 16) & 255;
	      out[outOffset + 50] = (i12 >>> 8) & 255;
	      out[outOffset + 51] = i12 & 255;
	      out[outOffset + 52] = (i13 >>> 24);
	      out[outOffset + 53] = (i13 >>> 16) & 255;
	      out[outOffset + 54] = (i13 >>> 8) & 255;
	      out[outOffset + 55] = i13 & 255;
	      out[outOffset + 56] = (i14 >>> 24);
	      out[outOffset + 57] = (i14 >>> 16) & 255;
	      out[outOffset + 58] = (i14 >>> 8) & 255;
	      out[outOffset + 59] = i14 & 255;
	      out[outOffset + 60] = (i15 >>> 24);
	      out[outOffset + 61] = (i15 >>> 16) & 255;
	      out[outOffset + 62] = (i15 >>> 8) & 255;
	      out[outOffset + 63] = i15 & 255;
		
		inpos.add(65);
		outpos.add(64);
	}
	
	//1 9bits
	protected static void fastunpack144(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 23);
		
		inpos.add(3);
		outpos.add(1);
	}

	//2 9bits
	protected static void fastunpack145(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
		
		inpos.add(4);
		outpos.add(2);
	}
	
	//3 9bits
	protected static void fastunpack146(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
		
		inpos.add(5);
		outpos.add(3);
	}
	
	//4 9bits
	protected static void fastunpack147(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);
	      
	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
		
		inpos.add(6);
		outpos.add(4);
	}
	
	//5 9bits
	protected static void fastunpack148(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);
	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
		
		inpos.add(7);
		outpos.add(5);
	}
	
	//6 9bits
	protected static void fastunpack149(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
		
		inpos.add(8);
		outpos.add(6);
	}
	
	//7 9bits
	protected static void fastunpack150(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
		
		inpos.add(9);
		outpos.add(7);
	}
	
	//8 9bits
	protected static void fastunpack151(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
		
		inpos.add(10);
		outpos.add(8);
	}
	
	//9 9bits
	protected static void fastunpack152(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
		
		inpos.add(12);
		outpos.add(9);
	}
	
	//10 9bits
	protected static void fastunpack153(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
		
		inpos.add(13);
		outpos.add(10);
	}
	
	//11 9bits
	protected static void fastunpack154(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
		
		inpos.add(14);
		outpos.add(11);
	}
	
	//12 9bits
	protected static void fastunpack155(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
	      out[outOffset + 11] = (i3 >>> 20) & 511;
		
		inpos.add(15);
		outpos.add(12);
	}
	
	//14 9bits
	protected static void fastunpack156(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
	      out[outOffset + 11] = (i3 >>> 20) & 511;
	      out[outOffset + 12] = (i3 >>> 11) & 511;
	      out[outOffset + 13] = (i3 >>> 2) & 511;
		
		inpos.add(17);
		outpos.add(14);
	}
	
	//16 9bits
	protected static void fastunpack157(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
	      out[outOffset + 11] = (i3 >>> 20) & 511;
	      out[outOffset + 12] = (i3 >>> 11) & 511;
	      out[outOffset + 13] = (i3 >>> 2) & 511;
	      out[outOffset + 14] = ((i3 << 7) | (i4 >>> 25)) & 511;
	      out[outOffset + 15] = (i4 >>> 16) & 511;
		
		inpos.add(19);
		outpos.add(16);
	}
	
	//32 9bits
	protected static void fastunpack158(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
	      out[outOffset + 11] = (i3 >>> 20) & 511;
	      out[outOffset + 12] = (i3 >>> 11) & 511;
	      out[outOffset + 13] = (i3 >>> 2) & 511;
	      out[outOffset + 14] = ((i3 << 7) | (i4 >>> 25)) & 511;
	      out[outOffset + 15] = (i4 >>> 16) & 511;
	      out[outOffset + 16] = (i4 >>> 7) & 511;
	      out[outOffset + 17] = ((i4 << 2) | (i5 >>> 30)) & 511;
	      out[outOffset + 18] = (i5 >>> 21) & 511;
	      out[outOffset + 19] = (i5 >>> 12) & 511;
	      out[outOffset + 20] = (i5 >>> 3) & 511;
	      out[outOffset + 21] = ((i5 << 6) | (i6 >>> 26)) & 511;
	      out[outOffset + 22] = (i6 >>> 17) & 511;
	      out[outOffset + 23] = (i6 >>> 8) & 511;
	      out[outOffset + 24] = ((i6 << 1) | (i7 >>> 31)) & 511;
	      out[outOffset + 25] = (i7 >>> 22) & 511;
	      out[outOffset + 26] = (i7 >>> 13) & 511;
	      out[outOffset + 27] = (i7 >>> 4) & 511;
	      out[outOffset + 28] = ((i7 << 5) | (i8 >>> 27)) & 511;
	      out[outOffset + 29] = (i8 >>> 18) & 511;
	      out[outOffset + 30] = (i8 >>> 9) & 511;
	      out[outOffset + 31] = i8 & 511;
		
		inpos.add(37);
		outpos.add(32);
	}
	
	//64 9bits
	protected static void fastunpack159(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      
	      out[outOffset + 0] = (i0 >>> 23);
	      out[outOffset + 1] = (i0 >>> 14) & 511;
	      out[outOffset + 2] = (i0 >>> 5) & 511;
	      out[outOffset + 3] = ((i0 << 4) | (i1 >>> 28)) & 511;
	      out[outOffset + 4] = (i1 >>> 19) & 511;
	      out[outOffset + 5] = (i1 >>> 10) & 511;
	      out[outOffset + 6] = (i1 >>> 1) & 511;
	      out[outOffset + 7] = ((i1 << 8) | (i2 >>> 24)) & 511;
	      out[outOffset + 8] = (i2 >>> 15) & 511;
	      out[outOffset + 9] = (i2 >>> 6) & 511;
	      out[outOffset + 10] = ((i2 << 3) | (i3 >>> 29)) & 511;
	      out[outOffset + 11] = (i3 >>> 20) & 511;
	      out[outOffset + 12] = (i3 >>> 11) & 511;
	      out[outOffset + 13] = (i3 >>> 2) & 511;
	      out[outOffset + 14] = ((i3 << 7) | (i4 >>> 25)) & 511;
	      out[outOffset + 15] = (i4 >>> 16) & 511;
	      out[outOffset + 16] = (i4 >>> 7) & 511;
	      out[outOffset + 17] = ((i4 << 2) | (i5 >>> 30)) & 511;
	      out[outOffset + 18] = (i5 >>> 21) & 511;
	      out[outOffset + 19] = (i5 >>> 12) & 511;
	      out[outOffset + 20] = (i5 >>> 3) & 511;
	      out[outOffset + 21] = ((i5 << 6) | (i6 >>> 26)) & 511;
	      out[outOffset + 22] = (i6 >>> 17) & 511;
	      out[outOffset + 23] = (i6 >>> 8) & 511;
	      out[outOffset + 24] = ((i6 << 1) | (i7 >>> 31)) & 511;
	      out[outOffset + 25] = (i7 >>> 22) & 511;
	      out[outOffset + 26] = (i7 >>> 13) & 511;
	      out[outOffset + 27] = (i7 >>> 4) & 511;
	      out[outOffset + 28] = ((i7 << 5) | (i8 >>> 27)) & 511;
	      out[outOffset + 29] = (i8 >>> 18) & 511;
	      out[outOffset + 30] = (i8 >>> 9) & 511;
	      out[outOffset + 31] = i8 & 511;
	      
	      out[outOffset + 32] = (i9 >>> 23);
	      out[outOffset + 33] = (i9 >>> 14) & 511;
	      out[outOffset + 34] = (i9 >>> 5) & 511;
	      out[outOffset + 35] = ((i9 << 4) | (i10 >>> 28)) & 511;
	      out[outOffset + 36] = (i10 >>> 19) & 511;
	      out[outOffset + 37] = (i10 >>> 10) & 511;
	      out[outOffset + 38] = (i10 >>> 1) & 511;
	      out[outOffset + 39] = ((i10 << 8) | (i11 >>> 24)) & 511;
	      out[outOffset + 40] = (i11 >>> 15) & 511;
	      out[outOffset + 41] = (i11 >>> 6) & 511;
	      out[outOffset + 42] = ((i11 << 3) | (i12 >>> 29)) & 511;
	      out[outOffset + 43] = (i12 >>> 20) & 511;
	      out[outOffset + 44] = (i12 >>> 11) & 511;
	      out[outOffset + 45] = (i12 >>> 2) & 511;
	      out[outOffset + 46] = ((i12 << 7) | (i13 >>> 25)) & 511;
	      out[outOffset + 47] = (i13 >>> 16) & 511;
	      out[outOffset + 48] = (i13 >>> 7) & 511;
	      out[outOffset + 49] = ((i13 << 2) | (i14 >>> 30)) & 511;
	      out[outOffset + 50] = (i14 >>> 21) & 511;
	      out[outOffset + 51] = (i14 >>> 12) & 511;
	      out[outOffset + 52] = (i14 >>> 3) & 511;
	      out[outOffset + 53] = ((i14 << 6) | (i15 >>> 26)) & 511;
	      out[outOffset + 54] = (i15 >>> 17) & 511;
	      out[outOffset + 55] = (i15 >>> 8) & 511;
	      out[outOffset + 56] = ((i15 << 1) | (i16 >>> 31)) & 511;
	      out[outOffset + 57] = (i16 >>> 22) & 511;
	      out[outOffset + 58] = (i16 >>> 13) & 511;
	      out[outOffset + 59] = (i16 >>> 4) & 511;
	      out[outOffset + 60] = ((i16 << 5) | (i17 >>> 27)) & 511;
	      out[outOffset + 61] = (i17 >>> 18) & 511;
	      out[outOffset + 62] = (i17 >>> 9) & 511;
	      out[outOffset + 63] = i17 & 511;
		
		inpos.add(73);
		outpos.add(64);
	}

	//1 10bits
	protected static void fastunpack160(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 22);
		
		inpos.add(3);
		outpos.add(1);
	}
	
	//2 10bits
	protected static void fastunpack161(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
		
		inpos.add(4);
		outpos.add(2);
	}
	
	//3 10bits
	protected static void fastunpack162(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
		
		inpos.add(5);
		outpos.add(3);
	}
	
	//4 10bits
	protected static void fastunpack163(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
		
		inpos.add(6);
		outpos.add(4);
	}
	
	//5 10bits
	protected static void fastunpack164(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
		
		inpos.add(8);
		outpos.add(5);
	}
	
	//6 10bits
	protected static void fastunpack165(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
		
		inpos.add(9);
		outpos.add(6);
	}
	
	//7 10bits
	protected static void fastunpack166(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
		
		inpos.add(10);
		outpos.add(7);
	}
	
	//8 10bits
	protected static void fastunpack167(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
		
		inpos.add(11);
		outpos.add(8);
	}
	
	//9 10bits
	protected static void fastunpack168(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
		
		inpos.add(13);
		outpos.add(9);
	}
	
	//10 10bits
	protected static void fastunpack169(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
		
		inpos.add(14);
		outpos.add(10);
	}
	
	//11 10bits
	protected static void fastunpack170(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
		
		inpos.add(15);
		outpos.add(11);
	}
	
	//12 10bits
	protected static void fastunpack171(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
	      out[outOffset + 11] = (i3 >>> 8) & 1023;
		
		inpos.add(16);
		outpos.add(12);
	}
	
	//14 10bits
	protected static void fastunpack172(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
	      out[outOffset + 11] = (i3 >>> 8) & 1023;
	      out[outOffset + 12] = ((i3 << 2) | (i4 >>> 30)) & 1023;
	      out[outOffset + 13] = (i4 >>> 20) & 1023;
		
		inpos.add(19);
		outpos.add(14);
	}
	
	//16 10bits
	protected static void fastunpack173(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
	      out[outOffset + 11] = (i3 >>> 8) & 1023;
	      out[outOffset + 12] = ((i3 << 2) | (i4 >>> 30)) & 1023;
	      out[outOffset + 13] = (i4 >>> 20) & 1023;
	      out[outOffset + 14] = (i4 >>> 10) & 1023;
	      out[outOffset + 15] = i4 & 1023;
		
		inpos.add(21);
		outpos.add(16);
	}
	
	//32 10bits
	protected static void fastunpack174(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
	      out[outOffset + 11] = (i3 >>> 8) & 1023;
	      out[outOffset + 12] = ((i3 << 2) | (i4 >>> 30)) & 1023;
	      out[outOffset + 13] = (i4 >>> 20) & 1023;
	      out[outOffset + 14] = (i4 >>> 10) & 1023;
	      out[outOffset + 15] = i4 & 1023;
	      out[outOffset + 16] = (i5 >>> 22);
	      out[outOffset + 17] = (i5 >>> 12) & 1023;
	      out[outOffset + 18] = (i5 >>> 2) & 1023;
	      out[outOffset + 19] = ((i5 << 8) | (i6 >>> 24)) & 1023;
	      out[outOffset + 20] = (i6 >>> 14) & 1023;
	      out[outOffset + 21] = (i6 >>> 4) & 1023;
	      out[outOffset + 22] = ((i6 << 6) | (i7 >>> 26)) & 1023;
	      out[outOffset + 23] = (i7 >>> 16) & 1023;
	      out[outOffset + 24] = (i7 >>> 6) & 1023;
	      out[outOffset + 25] = ((i7 << 4) | (i8 >>> 28)) & 1023;
	      out[outOffset + 26] = (i8 >>> 18) & 1023;
	      out[outOffset + 27] = (i8 >>> 8) & 1023;
	      out[outOffset + 28] = ((i8 << 2) | (i9 >>> 30)) & 1023;
	      out[outOffset + 29] = (i9 >>> 20) & 1023;
	      out[outOffset + 30] = (i9 >>> 10) & 1023;
	      out[outOffset + 31] = i9 & 1023;
		
		inpos.add(41);
		outpos.add(32);
	}
	
	//64 10bits
	protected static void fastunpack175(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 22);
	      out[outOffset + 1] = (i0 >>> 12) & 1023;
	      out[outOffset + 2] = (i0 >>> 2) & 1023;
	      out[outOffset + 3] = ((i0 << 8) | (i1 >>> 24)) & 1023;
	      out[outOffset + 4] = (i1 >>> 14) & 1023;
	      out[outOffset + 5] = (i1 >>> 4) & 1023;
	      out[outOffset + 6] = ((i1 << 6) | (i2 >>> 26)) & 1023;
	      out[outOffset + 7] = (i2 >>> 16) & 1023;
	      out[outOffset + 8] = (i2 >>> 6) & 1023;
	      out[outOffset + 9] = ((i2 << 4) | (i3 >>> 28)) & 1023;
	      out[outOffset + 10] = (i3 >>> 18) & 1023;
	      out[outOffset + 11] = (i3 >>> 8) & 1023;
	      out[outOffset + 12] = ((i3 << 2) | (i4 >>> 30)) & 1023;
	      out[outOffset + 13] = (i4 >>> 20) & 1023;
	      out[outOffset + 14] = (i4 >>> 10) & 1023;
	      out[outOffset + 15] = i4 & 1023;
	      out[outOffset + 16] = (i5 >>> 22);
	      out[outOffset + 17] = (i5 >>> 12) & 1023;
	      out[outOffset + 18] = (i5 >>> 2) & 1023;
	      out[outOffset + 19] = ((i5 << 8) | (i6 >>> 24)) & 1023;
	      out[outOffset + 20] = (i6 >>> 14) & 1023;
	      out[outOffset + 21] = (i6 >>> 4) & 1023;
	      out[outOffset + 22] = ((i6 << 6) | (i7 >>> 26)) & 1023;
	      out[outOffset + 23] = (i7 >>> 16) & 1023;
	      out[outOffset + 24] = (i7 >>> 6) & 1023;
	      out[outOffset + 25] = ((i7 << 4) | (i8 >>> 28)) & 1023;
	      out[outOffset + 26] = (i8 >>> 18) & 1023;
	      out[outOffset + 27] = (i8 >>> 8) & 1023;
	      out[outOffset + 28] = ((i8 << 2) | (i9 >>> 30)) & 1023;
	      out[outOffset + 29] = (i9 >>> 20) & 1023;
	      out[outOffset + 30] = (i9 >>> 10) & 1023;
	      out[outOffset + 31] = i9 & 1023;
	      
	      out[outOffset + 32] = (i10 >>> 22);
	      out[outOffset + 33] = (i10 >>> 12) & 1023;
	      out[outOffset + 34] = (i10 >>> 2) & 1023;
	      out[outOffset + 35] = ((i10 << 8) | (i11 >>> 24)) & 1023;
	      out[outOffset + 36] = (i11 >>> 14) & 1023;
	      out[outOffset + 37] = (i11 >>> 4) & 1023;
	      out[outOffset + 38] = ((i11 << 6) | (i12 >>> 26)) & 1023;
	      out[outOffset + 39] = (i12 >>> 16) & 1023;
	      out[outOffset + 40] = (i12 >>> 6) & 1023;
	      out[outOffset + 41] = ((i12 << 4) | (i13 >>> 28)) & 1023;
	      out[outOffset + 42] = (i13 >>> 18) & 1023;
	      out[outOffset + 43] = (i13 >>> 8) & 1023;
	      out[outOffset + 44] = ((i13 << 2) | (i14 >>> 30)) & 1023;
	      out[outOffset + 45] = (i14 >>> 20) & 1023;
	      out[outOffset + 46] = (i14 >>> 10) & 1023;
	      out[outOffset + 47] = i14 & 1023;
	      out[outOffset + 48] = (i15 >>> 22);
	      out[outOffset + 49] = (i15 >>> 12) & 1023;
	      out[outOffset + 50] = (i15 >>> 2) & 1023;
	      out[outOffset + 51] = ((i15 << 8) | (i16 >>> 24)) & 1023;
	      out[outOffset + 52] = (i16 >>> 14) & 1023;
	      out[outOffset + 53] = (i16 >>> 4) & 1023;
	      out[outOffset + 54] = ((i16 << 6) | (i17 >>> 26)) & 1023;
	      out[outOffset + 55] = (i17 >>> 16) & 1023;
	      out[outOffset + 56] = (i17 >>> 6) & 1023;
	      out[outOffset + 57] = ((i17 << 4) | (i18 >>> 28)) & 1023;
	      out[outOffset + 58] = (i18 >>> 18) & 1023;
	      out[outOffset + 59] = (i18 >>> 8) & 1023;
	      out[outOffset + 60] = ((i18 << 2) | (i19 >>> 30)) & 1023;
	      out[outOffset + 61] = (i19 >>> 20) & 1023;
	      out[outOffset + 62] = (i19 >>> 10) & 1023;
	      out[outOffset + 63] = i19 & 1023;
		
		inpos.add(81);
		outpos.add(64);
	}

	//1 11bits
	protected static void fastunpack176(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 21);
		
		inpos.add(3);
		outpos.add(1);
	}
	
	//2 11bits
	protected static void fastunpack177(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
		
		inpos.add(4);
		outpos.add(2);
	}
	
	//3 11bits
	protected static void fastunpack178(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
		
		inpos.add(6);
		outpos.add(3);
	}
	
	//4 11bits
	protected static void fastunpack179(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
		
		inpos.add(7);
		outpos.add(4);
	}
	
	//5 11bits
	protected static void fastunpack180(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
		
		inpos.add(8);
		outpos.add(5);
	}
	
	//6 11bits
	protected static void fastunpack181(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
		
		inpos.add(10);
		outpos.add(6);
	}
	
	//7 11bits
	protected static void fastunpack182(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
		
		inpos.add(11);
		outpos.add(7);
	}
	
	//8 11bits
	protected static void fastunpack183(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
		
		inpos.add(12);
		outpos.add(8);
	}
	
	//9 11bits
	protected static void fastunpack184(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
		
		inpos.add(14);
		outpos.add(9);
	}
	
	//10 11bits
	protected static void fastunpack185(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
		
		inpos.add(15);
		outpos.add(10);
	}
	
	//11 11bits
	protected static void fastunpack186(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
		
		inpos.add(17);
		outpos.add(11);
	}
	
	//12 11bits
	protected static void fastunpack187(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
	      out[outOffset + 11] = ((i3 << 4) | (i4 >>> 28)) & 2047;
		
		inpos.add(18);
		outpos.add(12);
	}
	
	//14 11bits
	protected static void fastunpack188(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
	      out[outOffset + 11] = ((i3 << 4) | (i4 >>> 28)) & 2047;
	      out[outOffset + 12] = (i4 >>> 17) & 2047;
	      out[outOffset + 13] = (i4 >>> 6) & 2047;
		
		inpos.add(21);
		outpos.add(14);
	}
	
	//16 11bits
	protected static void fastunpack189(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
	      out[outOffset + 11] = ((i3 << 4) | (i4 >>> 28)) & 2047;
	      out[outOffset + 12] = (i4 >>> 17) & 2047;
	      out[outOffset + 13] = (i4 >>> 6) & 2047;
	      out[outOffset + 14] = ((i4 << 5) | (i5 >>> 27)) & 2047;
	      out[outOffset + 15] = (i5 >>> 16) & 2047;
		
		inpos.add(23);
		outpos.add(16);
	}
	
	//32 11bits
	protected static void fastunpack190(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
	      out[outOffset + 11] = ((i3 << 4) | (i4 >>> 28)) & 2047;
	      out[outOffset + 12] = (i4 >>> 17) & 2047;
	      out[outOffset + 13] = (i4 >>> 6) & 2047;
	      out[outOffset + 14] = ((i4 << 5) | (i5 >>> 27)) & 2047;
	      out[outOffset + 15] = (i5 >>> 16) & 2047;
	      out[outOffset + 16] = (i5 >>> 5) & 2047;
	      out[outOffset + 17] = ((i5 << 6) | (i6 >>> 26)) & 2047;
	      out[outOffset + 18] = (i6 >>> 15) & 2047;
	      out[outOffset + 19] = (i6 >>> 4) & 2047;
	      out[outOffset + 20] = ((i6 << 7) | (i7 >>> 25)) & 2047;
	      out[outOffset + 21] = (i7 >>> 14) & 2047;
	      out[outOffset + 22] = (i7 >>> 3) & 2047;
	      out[outOffset + 23] = ((i7 << 8) | (i8 >>> 24)) & 2047;
	      out[outOffset + 24] = (i8 >>> 13) & 2047;
	      out[outOffset + 25] = (i8 >>> 2) & 2047;
	      out[outOffset + 26] = ((i8 << 9) | (i9 >>> 23)) & 2047;
	      out[outOffset + 27] = (i9 >>> 12) & 2047;
	      out[outOffset + 28] = (i9 >>> 1) & 2047;
	      out[outOffset + 29] = ((i9 << 10) | (i10 >>> 22)) & 2047;
	      out[outOffset + 30] = (i10 >>> 11) & 2047;
	      out[outOffset + 31] = i10 & 2047;
		
		inpos.add(45);
		outpos.add(32);
	}
	
	//64 11bits
	protected static void fastunpack191(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      
	      out[outOffset + 0] = (i0 >>> 21);
	      out[outOffset + 1] = (i0 >>> 10) & 2047;
	      out[outOffset + 2] = ((i0 << 1) | (i1 >>> 31)) & 2047;
	      out[outOffset + 3] = (i1 >>> 20) & 2047;
	      out[outOffset + 4] = (i1 >>> 9) & 2047;
	      out[outOffset + 5] = ((i1 << 2) | (i2 >>> 30)) & 2047;
	      out[outOffset + 6] = (i2 >>> 19) & 2047;
	      out[outOffset + 7] = (i2 >>> 8) & 2047;
	      out[outOffset + 8] = ((i2 << 3) | (i3 >>> 29)) & 2047;
	      out[outOffset + 9] = (i3 >>> 18) & 2047;
	      out[outOffset + 10] = (i3 >>> 7) & 2047;
	      out[outOffset + 11] = ((i3 << 4) | (i4 >>> 28)) & 2047;
	      out[outOffset + 12] = (i4 >>> 17) & 2047;
	      out[outOffset + 13] = (i4 >>> 6) & 2047;
	      out[outOffset + 14] = ((i4 << 5) | (i5 >>> 27)) & 2047;
	      out[outOffset + 15] = (i5 >>> 16) & 2047;
	      out[outOffset + 16] = (i5 >>> 5) & 2047;
	      out[outOffset + 17] = ((i5 << 6) | (i6 >>> 26)) & 2047;
	      out[outOffset + 18] = (i6 >>> 15) & 2047;
	      out[outOffset + 19] = (i6 >>> 4) & 2047;
	      out[outOffset + 20] = ((i6 << 7) | (i7 >>> 25)) & 2047;
	      out[outOffset + 21] = (i7 >>> 14) & 2047;
	      out[outOffset + 22] = (i7 >>> 3) & 2047;
	      out[outOffset + 23] = ((i7 << 8) | (i8 >>> 24)) & 2047;
	      out[outOffset + 24] = (i8 >>> 13) & 2047;
	      out[outOffset + 25] = (i8 >>> 2) & 2047;
	      out[outOffset + 26] = ((i8 << 9) | (i9 >>> 23)) & 2047;
	      out[outOffset + 27] = (i9 >>> 12) & 2047;
	      out[outOffset + 28] = (i9 >>> 1) & 2047;
	      out[outOffset + 29] = ((i9 << 10) | (i10 >>> 22)) & 2047;
	      out[outOffset + 30] = (i10 >>> 11) & 2047;
	      out[outOffset + 31] = i10 & 2047;
	      
	      out[outOffset + 32] = (i11 >>> 21);
	      out[outOffset + 33] = (i11 >>> 10) & 2047;
	      out[outOffset + 34] = ((i11 << 1) | (i12 >>> 31)) & 2047;
	      out[outOffset + 35] = (i12 >>> 20) & 2047;
	      out[outOffset + 36] = (i12 >>> 9) & 2047;
	      out[outOffset + 37] = ((i12 << 2) | (i13 >>> 30)) & 2047;
	      out[outOffset + 38] = (i13 >>> 19) & 2047;
	      out[outOffset + 39] = (i13 >>> 8) & 2047;
	      out[outOffset + 40] = ((i13 << 3) | (i14 >>> 29)) & 2047;
	      out[outOffset + 41] = (i14 >>> 18) & 2047;
	      out[outOffset + 42] = (i14 >>> 7) & 2047;
	      out[outOffset + 43] = ((i14 << 4) | (i15 >>> 28)) & 2047;
	      out[outOffset + 44] = (i15 >>> 17) & 2047;
	      out[outOffset + 45] = (i15 >>> 6) & 2047;
	      out[outOffset + 46] = ((i15 << 5) | (i16 >>> 27)) & 2047;
	      out[outOffset + 47] = (i16 >>> 16) & 2047;
	      out[outOffset + 48] = (i16 >>> 5) & 2047;
	      out[outOffset + 49] = ((i16 << 6) | (i17 >>> 26)) & 2047;
	      out[outOffset + 50] = (i17 >>> 15) & 2047;
	      out[outOffset + 51] = (i17 >>> 4) & 2047;
	      out[outOffset + 52] = ((i17 << 7) | (i18 >>> 25)) & 2047;
	      out[outOffset + 53] = (i18 >>> 14) & 2047;
	      out[outOffset + 54] = (i18 >>> 3) & 2047;
	      out[outOffset + 55] = ((i18 << 8) | (i19 >>> 24)) & 2047;
	      out[outOffset + 56] = (i19 >>> 13) & 2047;
	      out[outOffset + 57] = (i19 >>> 2) & 2047;
	      out[outOffset + 58] = ((i19 << 9) | (i20 >>> 23)) & 2047;
	      out[outOffset + 59] = (i20 >>> 12) & 2047;
	      out[outOffset + 60] = (i20 >>> 1) & 2047;
	      out[outOffset + 61] = ((i20 << 10) | (i21 >>> 22)) & 2047;
	      out[outOffset + 62] = (i21 >>> 11) & 2047;
	      out[outOffset + 63] = i21 & 2047;
		
		inpos.add(89);
		outpos.add(64);
	}

	//1 12bits
	protected static void fastunpack192(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 20);
		
		inpos.add(3);
		outpos.add(1);
	}
	
	//2 12bits
	protected static void fastunpack193(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
		
		inpos.add(4);
		outpos.add(2);
	}
	
	//3 12bits
	protected static void fastunpack194(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
		
		inpos.add(6);
		outpos.add(3);
	}
	
	//4 12bits
	protected static void fastunpack195(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
		
		inpos.add(7);
		outpos.add(4);
	}
	
	//5 12bits
	protected static void fastunpack196(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
		
		inpos.add(9);
		outpos.add(5);
	}
	
	//6 12bits
	protected static void fastunpack197(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
		
		inpos.add(10);
		outpos.add(6);
	}
	
	//7 12bits
	protected static void fastunpack198(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
		
		inpos.add(12);
		outpos.add(7);
	}
	
	//8 12bits
	protected static void fastunpack199(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
		
		inpos.add(13);
		outpos.add(8);
	}
	
	//9 12bits
	protected static void fastunpack200(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
		
		inpos.add(15);
		outpos.add(9);
	}
	
	//10 12bits
	protected static void fastunpack201(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
		
		inpos.add(16);
		outpos.add(10);
	}
	
	//11 12bits
	protected static void fastunpack202(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
		
		inpos.add(18);
		outpos.add(11);
	}
	
	//12 12bits
	protected static void fastunpack203(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
	      out[outOffset + 11] = (i4 >>> 16) & 4095;
		
		inpos.add(19);
		outpos.add(12);
	}
	
	//14 12bits
	protected static void fastunpack204(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
	      out[outOffset + 11] = (i4 >>> 16) & 4095;
	      out[outOffset + 12] = (i4 >>> 4) & 4095;
	      out[outOffset + 13] = ((i4 << 8) | (i5 >>> 24)) & 4095;
		
		inpos.add(22);
		outpos.add(14);
	}
	
	//16 12bits
	protected static void fastunpack205(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
	      out[outOffset + 11] = (i4 >>> 16) & 4095;
	      out[outOffset + 12] = (i4 >>> 4) & 4095;
	      out[outOffset + 13] = ((i4 << 8) | (i5 >>> 24)) & 4095;
	      out[outOffset + 14] = (i5 >>> 12) & 4095;
	      out[outOffset + 15] = i5 & 4095;
		
		inpos.add(25);
		outpos.add(16);
	}
	
	//32 12bits
	protected static void fastunpack206(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
	      out[outOffset + 11] = (i4 >>> 16) & 4095;
	      out[outOffset + 12] = (i4 >>> 4) & 4095;
	      out[outOffset + 13] = ((i4 << 8) | (i5 >>> 24)) & 4095;
	      out[outOffset + 14] = (i5 >>> 12) & 4095;
	      out[outOffset + 15] = i5 & 4095;
	      out[outOffset + 16] = (i6 >>> 20);
	      out[outOffset + 17] = (i6 >>> 8) & 4095;
	      out[outOffset + 18] = ((i6 << 4) | (i7 >>> 28)) & 4095;
	      out[outOffset + 19] = (i7 >>> 16) & 4095;
	      out[outOffset + 20] = (i7 >>> 4) & 4095;
	      out[outOffset + 21] = ((i7 << 8) | (i8 >>> 24)) & 4095;
	      out[outOffset + 22] = (i8 >>> 12) & 4095;
	      out[outOffset + 23] = i8 & 4095;
	      out[outOffset + 24] = (i9 >>> 20);
	      out[outOffset + 25] = (i9 >>> 8) & 4095;
	      out[outOffset + 26] = ((i9 << 4) | (i10 >>> 28)) & 4095;
	      out[outOffset + 27] = (i10 >>> 16) & 4095;
	      out[outOffset + 28] = (i10 >>> 4) & 4095;
	      out[outOffset + 29] = ((i10 << 8) | (i11 >>> 24)) & 4095;
	      out[outOffset + 30] = (i11 >>> 12) & 4095;
	      out[outOffset + 31] = i11 & 4095;
		
		inpos.add(49);
		outpos.add(32);
	}
	
	//64 12bits
	protected static void fastunpack207(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      
	      out[outOffset + 0] = (i0 >>> 20);
	      out[outOffset + 1] = (i0 >>> 8) & 4095;
	      out[outOffset + 2] = ((i0 << 4) | (i1 >>> 28)) & 4095;
	      out[outOffset + 3] = (i1 >>> 16) & 4095;
	      out[outOffset + 4] = (i1 >>> 4) & 4095;
	      out[outOffset + 5] = ((i1 << 8) | (i2 >>> 24)) & 4095;
	      out[outOffset + 6] = (i2 >>> 12) & 4095;
	      out[outOffset + 7] = i2 & 4095;
	      out[outOffset + 8] = (i3 >>> 20);
	      out[outOffset + 9] = (i3 >>> 8) & 4095;
	      out[outOffset + 10] = ((i3 << 4) | (i4 >>> 28)) & 4095;
	      out[outOffset + 11] = (i4 >>> 16) & 4095;
	      out[outOffset + 12] = (i4 >>> 4) & 4095;
	      out[outOffset + 13] = ((i4 << 8) | (i5 >>> 24)) & 4095;
	      out[outOffset + 14] = (i5 >>> 12) & 4095;
	      out[outOffset + 15] = i5 & 4095;
	      out[outOffset + 16] = (i6 >>> 20);
	      out[outOffset + 17] = (i6 >>> 8) & 4095;
	      out[outOffset + 18] = ((i6 << 4) | (i7 >>> 28)) & 4095;
	      out[outOffset + 19] = (i7 >>> 16) & 4095;
	      out[outOffset + 20] = (i7 >>> 4) & 4095;
	      out[outOffset + 21] = ((i7 << 8) | (i8 >>> 24)) & 4095;
	      out[outOffset + 22] = (i8 >>> 12) & 4095;
	      out[outOffset + 23] = i8 & 4095;
	      out[outOffset + 24] = (i9 >>> 20);
	      out[outOffset + 25] = (i9 >>> 8) & 4095;
	      out[outOffset + 26] = ((i9 << 4) | (i10 >>> 28)) & 4095;
	      out[outOffset + 27] = (i10 >>> 16) & 4095;
	      out[outOffset + 28] = (i10 >>> 4) & 4095;
	      out[outOffset + 29] = ((i10 << 8) | (i11 >>> 24)) & 4095;
	      out[outOffset + 30] = (i11 >>> 12) & 4095;
	      out[outOffset + 31] = i11 & 4095;
	      
	      out[outOffset + 32] = (i12 >>> 20);
	      out[outOffset + 33] = (i12 >>> 8) & 4095;
	      out[outOffset + 34] = ((i12 << 4) | (i13 >>> 28)) & 4095;
	      out[outOffset + 35] = (i13 >>> 16) & 4095;
	      out[outOffset + 36] = (i13 >>> 4) & 4095;
	      out[outOffset + 37] = ((i13 << 8) | (i14 >>> 24)) & 4095;
	      out[outOffset + 38] = (i14 >>> 12) & 4095;
	      out[outOffset + 39] = i14 & 4095;
	      out[outOffset + 40] = (i15 >>> 20);
	      out[outOffset + 41] = (i15 >>> 8) & 4095;
	      out[outOffset + 42] = ((i15 << 4) | (i16 >>> 28)) & 4095;
	      out[outOffset + 43] = (i16 >>> 16) & 4095;
	      out[outOffset + 44] = (i16 >>> 4) & 4095;
	      out[outOffset + 45] = ((i16 << 8) | (i17 >>> 24)) & 4095;
	      out[outOffset + 46] = (i17 >>> 12) & 4095;
	      out[outOffset + 47] = i17 & 4095;
	      out[outOffset + 48] = (i18 >>> 20);
	      out[outOffset + 49] = (i18 >>> 8) & 4095;
	      out[outOffset + 50] = ((i18 << 4) | (i19 >>> 28)) & 4095;
	      out[outOffset + 51] = (i19 >>> 16) & 4095;
	      out[outOffset + 52] = (i19 >>> 4) & 4095;
	      out[outOffset + 53] = ((i19 << 8) | (i20 >>> 24)) & 4095;
	      out[outOffset + 54] = (i20 >>> 12) & 4095;
	      out[outOffset + 55] = i20 & 4095;
	      out[outOffset + 56] = (i21 >>> 20);
	      out[outOffset + 57] = (i21 >>> 8) & 4095;
	      out[outOffset + 58] = ((i21 << 4) | (i22 >>> 28)) & 4095;
	      out[outOffset + 59] = (i22 >>> 16) & 4095;
	      out[outOffset + 60] = (i22 >>> 4) & 4095;
	      out[outOffset + 61] = ((i22 << 8) | (i23 >>> 24)) & 4095;
	      out[outOffset + 62] = (i23 >>> 12) & 4095;
	      out[outOffset + 63] = i23 & 4095;
		
		inpos.add(97);
		outpos.add(64);
	}

	//1 16bits
	protected static void fastunpack208(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 16);
		
		inpos.add(3);
		outpos.add(1);
	}
	
	//2 16bits
	protected static void fastunpack209(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
		
		inpos.add(5);
		outpos.add(2);
	}
	
	//3 16bits
	protected static void fastunpack210(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
		
		inpos.add(7);
		outpos.add(3);
	}
	
	//4 16bits
	protected static void fastunpack211(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
		
		inpos.add(9);
		outpos.add(4);
	}
	
	//5 16bits
	protected static void fastunpack212(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
		
		inpos.add(11);
		outpos.add(5);
	}
	
	//6 16bits
	protected static void fastunpack213(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
		
		inpos.add(13);
		outpos.add(6);
	}
	
	//7 16bits
	protected static void fastunpack214(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
		
		inpos.add(15);
		outpos.add(7);
	}
	
	//8 16bits
	protected static void fastunpack215(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
		
		inpos.add(17);
		outpos.add(8);
	}
	
	//9 16bits
	protected static void fastunpack216(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
		
		inpos.add(19);
		outpos.add(9);
	}
	
	//10 16bits
	protected static void fastunpack217(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
		
		inpos.add(21);
		outpos.add(10);
	}
	
	//11 16bits
	protected static void fastunpack218(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
		
		inpos.add(23);
		outpos.add(11);
	}
	
	//12 16bits
	protected static void fastunpack219(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
	      out[outOffset + 11] = i5 & 65535;
		
		inpos.add(25);
		outpos.add(12);
	}
	
	//14 16bits
	protected static void fastunpack220(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
	      out[outOffset + 11] = i5 & 65535;
	      out[outOffset + 12] = (i6 >>> 16);
	      out[outOffset + 13] = i6 & 65535;
		
		inpos.add(29);
		outpos.add(14);
	}
	
	//16 16bits
	protected static void fastunpack221(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
	      out[outOffset + 11] = i5 & 65535;
	      out[outOffset + 12] = (i6 >>> 16);
	      out[outOffset + 13] = i6 & 65535;
	      out[outOffset + 14] = (i7 >>> 16);
	      out[outOffset + 15] = i7 & 65535;
		
		inpos.add(33);
		outpos.add(16);
	}
	
	//32 16bits
	protected static void fastunpack222(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	     final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
	      out[outOffset + 11] = i5 & 65535;
	      out[outOffset + 12] = (i6 >>> 16);
	      out[outOffset + 13] = i6 & 65535;
	      out[outOffset + 14] = (i7 >>> 16);
	      out[outOffset + 15] = i7 & 65535;
	      out[outOffset + 16] = (i8 >>> 16);
	      out[outOffset + 17] = i8 & 65535;
	      out[outOffset + 18] = (i9 >>> 16);
	      out[outOffset + 19] = i9 & 65535;
	      out[outOffset + 20] = (i10 >>> 16);
	      out[outOffset + 21] = i10 & 65535;
	      out[outOffset + 22] = (i11 >>> 16);
	      out[outOffset + 23] = i11 & 65535;
	      out[outOffset + 24] = (i12 >>> 16);
	      out[outOffset + 25] = i12 & 65535;
	      out[outOffset + 26] = (i13 >>> 16);
	      out[outOffset + 27] = i13 & 65535;
	      out[outOffset + 28] = (i14 >>> 16);
	      out[outOffset + 29] = i14 & 65535;
	      out[outOffset + 30] = (i15 >>> 16);
	      out[outOffset + 31] = i15 & 65535;
		
		inpos.add(65);
		outpos.add(32);
	}
	
	//64 16bits
	protected static void fastunpack223(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));
	      final int i30 = ((in[inOffset + 120] & 0xFF) << 24) | ((in[inOffset + 121] & 0xFF) << 16) | ((in[inOffset + 122] & 0xFF) << 8) | ((in[inOffset + 123] & 0xFF));
	      final int i31 = ((in[inOffset + 124] & 0xFF) << 24) | ((in[inOffset + 125] & 0xFF) << 16) | ((in[inOffset + 126] & 0xFF) << 8) | ((in[inOffset + 127] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 16);
	      out[outOffset + 1] = i0 & 65535;
	      out[outOffset + 2] = (i1 >>> 16);
	      out[outOffset + 3] = i1 & 65535;
	      out[outOffset + 4] = (i2 >>> 16);
	      out[outOffset + 5] = i2 & 65535;
	      out[outOffset + 6] = (i3 >>> 16);
	      out[outOffset + 7] = i3 & 65535;
	      out[outOffset + 8] = (i4 >>> 16);
	      out[outOffset + 9] = i4 & 65535;
	      out[outOffset + 10] = (i5 >>> 16);
	      out[outOffset + 11] = i5 & 65535;
	      out[outOffset + 12] = (i6 >>> 16);
	      out[outOffset + 13] = i6 & 65535;
	      out[outOffset + 14] = (i7 >>> 16);
	      out[outOffset + 15] = i7 & 65535;
	      out[outOffset + 16] = (i8 >>> 16);
	      out[outOffset + 17] = i8 & 65535;
	      out[outOffset + 18] = (i9 >>> 16);
	      out[outOffset + 19] = i9 & 65535;
	      out[outOffset + 20] = (i10 >>> 16);
	      out[outOffset + 21] = i10 & 65535;
	      out[outOffset + 22] = (i11 >>> 16);
	      out[outOffset + 23] = i11 & 65535;
	      out[outOffset + 24] = (i12 >>> 16);
	      out[outOffset + 25] = i12 & 65535;
	      out[outOffset + 26] = (i13 >>> 16);
	      out[outOffset + 27] = i13 & 65535;
	      out[outOffset + 28] = (i14 >>> 16);
	      out[outOffset + 29] = i14 & 65535;
	      out[outOffset + 30] = (i15 >>> 16);
	      out[outOffset + 31] = i15 & 65535;
	      
	      out[outOffset + 32] = (i16 >>> 16);
	      out[outOffset + 33] = i16 & 65535;
	      out[outOffset + 34] = (i17 >>> 16);
	      out[outOffset + 35] = i17 & 65535;
	      out[outOffset + 36] = (i18 >>> 16);
	      out[outOffset + 37] = i18 & 65535;
	      out[outOffset + 38] = (i19 >>> 16);
	      out[outOffset + 39] = i19 & 65535;
	      out[outOffset + 40] = (i20 >>> 16);
	      out[outOffset + 41] = i20 & 65535;
	      out[outOffset + 42] = (i21 >>> 16);
	      out[outOffset + 43] = i21 & 65535;
	      out[outOffset + 44] = (i22 >>> 16);
	      out[outOffset + 45] = i22 & 65535;
	      out[outOffset + 46] = (i23 >>> 16);
	      out[outOffset + 47] = i23 & 65535;
	      out[outOffset + 48] = (i24 >>> 16);
	      out[outOffset + 49] = i24 & 65535;
	      out[outOffset + 50] = (i25 >>> 16);
	      out[outOffset + 51] = i25 & 65535;
	      out[outOffset + 52] = (i26 >>> 16);
	      out[outOffset + 53] = i26 & 65535;
	      out[outOffset + 54] = (i27 >>> 16);
	      out[outOffset + 55] = i27 & 65535;
	      out[outOffset + 56] = (i28 >>> 16);
	      out[outOffset + 57] = i28 & 65535;
	      out[outOffset + 58] = (i29 >>> 16);
	      out[outOffset + 59] = i29 & 65535;
	      out[outOffset + 60] = (i30 >>> 16);
	      out[outOffset + 61] = i30 & 65535;
	      out[outOffset + 62] = (i31 >>> 16);
	      out[outOffset + 63] = i31 & 65535;
		
		inpos.add(129);
		outpos.add(64);
	}

	//1 20bits
	protected static void fastunpack224(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 12);
		
		inpos.add(4);
		outpos.add(1);
	}
	
	//2 20bits
	protected static void fastunpack225(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
		
		inpos.add(6);
		outpos.add(2);
	}
	
	//3 20bits
	protected static void fastunpack226(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
		
		inpos.add(9);
		outpos.add(3);
	}
	
	//4 20bits
	protected static void fastunpack227(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
		
		inpos.add(11);
		outpos.add(4);
	}
	
	//5 20bits
	protected static void fastunpack228(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
		
		inpos.add(14);
		outpos.add(5);
	}
	
	//6 20bits
	protected static void fastunpack229(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
		
		inpos.add(16);
		outpos.add(6);
	}
	
	//7 20bits
	protected static void fastunpack230(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
		
		inpos.add(19);
		outpos.add(7);
	}
	
	//8 20bits
	protected static void fastunpack231(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
		
		inpos.add(21);
		outpos.add(8);
	}
	
	//9 20bits
	protected static void fastunpack232(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
		
		inpos.add(24);
		outpos.add(9);
	}
	
	//10 20bits
	protected static void fastunpack233(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
		
		inpos.add(26);
		outpos.add(10);
	}
	
	//11 20bits
	protected static void fastunpack234(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
		
		inpos.add(29);
		outpos.add(11);
	}
	
	//12 20bits
	protected static void fastunpack235(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
	      out[outOffset + 11] = ((i6 << 16) | (i7 >>> 16)) & 1048575;
		
		inpos.add(31);
		outpos.add(12);
	}
	
	//14 20bits
	protected static void fastunpack236(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8);

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
	      out[outOffset + 11] = ((i6 << 16) | (i7 >>> 16)) & 1048575;
	      out[outOffset + 12] = ((i7 << 4) | (i8 >>> 28)) & 1048575;
	      out[outOffset + 13] = (i8 >>> 8) & 1048575;
		
		inpos.add(36);
		outpos.add(14);
	}
	
	//16 20bits
	protected static void fastunpack237(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
	      out[outOffset + 11] = ((i6 << 16) | (i7 >>> 16)) & 1048575;
	      out[outOffset + 12] = ((i7 << 4) | (i8 >>> 28)) & 1048575;
	      out[outOffset + 13] = (i8 >>> 8) & 1048575;
	      out[outOffset + 14] = ((i8 << 12) | (i9 >>> 20)) & 1048575;
	      out[outOffset + 15] = i9 & 1048575;
		
		inpos.add(41);
		outpos.add(16);
	}
	
	//32 20bits
	protected static void fastunpack238(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
	      out[outOffset + 11] = ((i6 << 16) | (i7 >>> 16)) & 1048575;
	      out[outOffset + 12] = ((i7 << 4) | (i8 >>> 28)) & 1048575;
	      out[outOffset + 13] = (i8 >>> 8) & 1048575;
	      out[outOffset + 14] = ((i8 << 12) | (i9 >>> 20)) & 1048575;
	      out[outOffset + 15] = i9 & 1048575;
	      out[outOffset + 16] = (i10 >>> 12);
	      out[outOffset + 17] = ((i10 << 8) | (i11 >>> 24)) & 1048575;
	      out[outOffset + 18] = (i11 >>> 4) & 1048575;
	      out[outOffset + 19] = ((i11 << 16) | (i12 >>> 16)) & 1048575;
	      out[outOffset + 20] = ((i12 << 4) | (i13 >>> 28)) & 1048575;
	      out[outOffset + 21] = (i13 >>> 8) & 1048575;
	      out[outOffset + 22] = ((i13 << 12) | (i14 >>> 20)) & 1048575;
	      out[outOffset + 23] = i14 & 1048575;
	      out[outOffset + 24] = (i15 >>> 12);
	      out[outOffset + 25] = ((i15 << 8) | (i16 >>> 24)) & 1048575;
	      out[outOffset + 26] = (i16 >>> 4) & 1048575;
	      out[outOffset + 27] = ((i16 << 16) | (i17 >>> 16)) & 1048575;
	      out[outOffset + 28] = ((i17 << 4) | (i18 >>> 28)) & 1048575;
	      out[outOffset + 29] = (i18 >>> 8) & 1048575;
	      out[outOffset + 30] = ((i18 << 12) | (i19 >>> 20)) & 1048575;
	      out[outOffset + 31] = i19 & 1048575;
		
		inpos.add(81);
		outpos.add(32);
	}
	
	//64 20bits
	protected static void fastunpack239(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
		final int inOffset = inpos.get() + 1;
		final int outOffset = outpos.get();

	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));
	      final int i30 = ((in[inOffset + 120] & 0xFF) << 24) | ((in[inOffset + 121] & 0xFF) << 16) | ((in[inOffset + 122] & 0xFF) << 8) | ((in[inOffset + 123] & 0xFF));
	      final int i31 = ((in[inOffset + 124] & 0xFF) << 24) | ((in[inOffset + 125] & 0xFF) << 16) | ((in[inOffset + 126] & 0xFF) << 8) | ((in[inOffset + 127] & 0xFF));
	      final int i32 = ((in[inOffset + 128] & 0xFF) << 24) | ((in[inOffset + 129] & 0xFF) << 16) | ((in[inOffset + 130] & 0xFF) << 8) | ((in[inOffset + 131] & 0xFF));
	      final int i33 = ((in[inOffset + 132] & 0xFF) << 24) | ((in[inOffset + 133] & 0xFF) << 16) | ((in[inOffset + 134] & 0xFF) << 8) | ((in[inOffset + 135] & 0xFF));
	      final int i34 = ((in[inOffset + 136] & 0xFF) << 24) | ((in[inOffset + 137] & 0xFF) << 16) | ((in[inOffset + 138] & 0xFF) << 8) | ((in[inOffset + 139] & 0xFF));
	      final int i35 = ((in[inOffset + 140] & 0xFF) << 24) | ((in[inOffset + 141] & 0xFF) << 16) | ((in[inOffset + 142] & 0xFF) << 8) | ((in[inOffset + 143] & 0xFF));
	      final int i36 = ((in[inOffset + 144] & 0xFF) << 24) | ((in[inOffset + 145] & 0xFF) << 16) | ((in[inOffset + 146] & 0xFF) << 8) | ((in[inOffset + 147] & 0xFF));
	      final int i37 = ((in[inOffset + 148] & 0xFF) << 24) | ((in[inOffset + 149] & 0xFF) << 16) | ((in[inOffset + 150] & 0xFF) << 8) | ((in[inOffset + 151] & 0xFF));
	      final int i38 = ((in[inOffset + 152] & 0xFF) << 24) | ((in[inOffset + 153] & 0xFF) << 16) | ((in[inOffset + 154] & 0xFF) << 8) | ((in[inOffset + 155] & 0xFF));
	      final int i39 = ((in[inOffset + 156] & 0xFF) << 24) | ((in[inOffset + 157] & 0xFF) << 16) | ((in[inOffset + 158] & 0xFF) << 8) | ((in[inOffset + 159] & 0xFF));

	      out[outOffset + 0] = (i0 >>> 12);
	      out[outOffset + 1] = ((i0 << 8) | (i1 >>> 24)) & 1048575;
	      out[outOffset + 2] = (i1 >>> 4) & 1048575;
	      out[outOffset + 3] = ((i1 << 16) | (i2 >>> 16)) & 1048575;
	      out[outOffset + 4] = ((i2 << 4) | (i3 >>> 28)) & 1048575;
	      out[outOffset + 5] = (i3 >>> 8) & 1048575;
	      out[outOffset + 6] = ((i3 << 12) | (i4 >>> 20)) & 1048575;
	      out[outOffset + 7] = i4 & 1048575;
	      out[outOffset + 8] = (i5 >>> 12);
	      out[outOffset + 9] = ((i5 << 8) | (i6 >>> 24)) & 1048575;
	      out[outOffset + 10] = (i6 >>> 4) & 1048575;
	      out[outOffset + 11] = ((i6 << 16) | (i7 >>> 16)) & 1048575;
	      out[outOffset + 12] = ((i7 << 4) | (i8 >>> 28)) & 1048575;
	      out[outOffset + 13] = (i8 >>> 8) & 1048575;
	      out[outOffset + 14] = ((i8 << 12) | (i9 >>> 20)) & 1048575;
	      out[outOffset + 15] = i9 & 1048575;
	      out[outOffset + 16] = (i10 >>> 12);
	      out[outOffset + 17] = ((i10 << 8) | (i11 >>> 24)) & 1048575;
	      out[outOffset + 18] = (i11 >>> 4) & 1048575;
	      out[outOffset + 19] = ((i11 << 16) | (i12 >>> 16)) & 1048575;
	      out[outOffset + 20] = ((i12 << 4) | (i13 >>> 28)) & 1048575;
	      out[outOffset + 21] = (i13 >>> 8) & 1048575;
	      out[outOffset + 22] = ((i13 << 12) | (i14 >>> 20)) & 1048575;
	      out[outOffset + 23] = i14 & 1048575;
	      out[outOffset + 24] = (i15 >>> 12);
	      out[outOffset + 25] = ((i15 << 8) | (i16 >>> 24)) & 1048575;
	      out[outOffset + 26] = (i16 >>> 4) & 1048575;
	      out[outOffset + 27] = ((i16 << 16) | (i17 >>> 16)) & 1048575;
	      out[outOffset + 28] = ((i17 << 4) | (i18 >>> 28)) & 1048575;
	      out[outOffset + 29] = (i18 >>> 8) & 1048575;
	      out[outOffset + 30] = ((i18 << 12) | (i19 >>> 20)) & 1048575;
	      out[outOffset + 31] = i19 & 1048575;
	      
	      out[outOffset + 32] = (i20 >>> 12);
	      out[outOffset + 33] = ((i20 << 8) | (i21 >>> 24)) & 1048575;
	      out[outOffset + 34] = (i21 >>> 4) & 1048575;
	      out[outOffset + 35] = ((i21 << 16) | (i22 >>> 16)) & 1048575;
	      out[outOffset + 36] = ((i22 << 4) | (i23 >>> 28)) & 1048575;
	      out[outOffset + 37] = (i23 >>> 8) & 1048575;
	      out[outOffset + 38] = ((i23 << 12) | (i24 >>> 20)) & 1048575;
	      out[outOffset + 39] = i24 & 1048575;
	      out[outOffset + 40] = (i25 >>> 12);
	      out[outOffset + 41] = ((i25 << 8) | (i26 >>> 24)) & 1048575;
	      out[outOffset + 42] = (i26 >>> 4) & 1048575;
	      out[outOffset + 43] = ((i26 << 16) | (i27 >>> 16)) & 1048575;
	      out[outOffset + 44] = ((i27 << 4) | (i28 >>> 28)) & 1048575;
	      out[outOffset + 45] = (i28 >>> 8) & 1048575;
	      out[outOffset + 46] = ((i28 << 12) | (i29 >>> 20)) & 1048575;
	      out[outOffset + 47] = i29 & 1048575;
	      out[outOffset + 48] = (i30 >>> 12);
	      out[outOffset + 49] = ((i30 << 8) | (i31 >>> 24)) & 1048575;
	      out[outOffset + 50] = (i31 >>> 4) & 1048575;
	      out[outOffset + 51] = ((i31 << 16) | (i32 >>> 16)) & 1048575;
	      out[outOffset + 52] = ((i32 << 4) | (i33 >>> 28)) & 1048575;
	      out[outOffset + 53] = (i33 >>> 8) & 1048575;
	      out[outOffset + 54] = ((i33 << 12) | (i34 >>> 20)) & 1048575;
	      out[outOffset + 55] = i34 & 1048575;
	      out[outOffset + 56] = (i35 >>> 12);
	      out[outOffset + 57] = ((i35 << 8) | (i36 >>> 24)) & 1048575;
	      out[outOffset + 58] = (i36 >>> 4) & 1048575;
	      out[outOffset + 59] = ((i36 << 16) | (i37 >>> 16)) & 1048575;
	      out[outOffset + 60] = ((i37 << 4) | (i38 >>> 28)) & 1048575;
	      out[outOffset + 61] = (i38 >>> 8) & 1048575;
	      out[outOffset + 62] = ((i38 << 12) | (i39 >>> 20)) & 1048575;
	      out[outOffset + 63] = i39 & 1048575;
		
		inpos.add(161);
		outpos.add(64);
	}

	//1 32bits
	protected static void fastunpack240(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));

	      out[outOffset + 0] = i0;
	      
	      inpos.add(5);
	      outpos.add(1);
	}
	
	//2 32bits
	protected static void fastunpack241(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      
	      inpos.add(9);
	      outpos.add(2);
	}
	
	//3 32bits
	protected static void fastunpack242(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      
	      inpos.add(13);
	      outpos.add(3);
	}
	
	//4 32bits
	protected static void fastunpack243(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      
	      inpos.add(17);
	      outpos.add(4);
	}
	
	//5 32bits
	protected static void fastunpack244(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      
	      inpos.add(21);
	      outpos.add(5);
	}
	
	//6 32bits
	protected static void fastunpack245(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      
	      inpos.add(25);
	      outpos.add(6);
	}
	
	//7 32bits
	protected static void fastunpack246(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      
	      inpos.add(29);
	      outpos.add(7);
	}
	
	//8 32bits
	protected static void fastunpack247(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      
	      inpos.add(33);
	      outpos.add(8);
	}
	
	//9 32bits
	protected static void fastunpack248(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      
	      inpos.add(37);
	      outpos.add(9);
	}
	
	//10 32bits
	protected static void fastunpack249(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      
	      inpos.add(41);
	      outpos.add(10);
	}
	
	//11 32bits
	protected static void fastunpack250(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      
	      inpos.add(45);
	      outpos.add(11);
	}
	
	//12 32bits
	protected static void fastunpack251(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      out[outOffset + 11] = i11;
	      
	      inpos.add(49);
	      outpos.add(12);
	}
	
	//14 32bits
	protected static void fastunpack252(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      out[outOffset + 11] = i11;
	      out[outOffset + 12] = i12;
	      out[outOffset + 13] = i13;
	      
	      inpos.add(57);
	      outpos.add(14);
	}
	
	//16 32bits
	protected static void fastunpack253(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      out[outOffset + 11] = i11;
	      out[outOffset + 12] = i12;
	      out[outOffset + 13] = i13;
	      out[outOffset + 14] = i14;
	      out[outOffset + 15] = i15;
	      
	      inpos.add(65);
	      outpos.add(16);
	}
	
	//32 32bits
	protected static void fastunpack254(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));
	      final int i30 = ((in[inOffset + 120] & 0xFF) << 24) | ((in[inOffset + 121] & 0xFF) << 16) | ((in[inOffset + 122] & 0xFF) << 8) | ((in[inOffset + 123] & 0xFF));
	      final int i31 = ((in[inOffset + 124] & 0xFF) << 24) | ((in[inOffset + 125] & 0xFF) << 16) | ((in[inOffset + 126] & 0xFF) << 8) | ((in[inOffset + 127] & 0xFF));

	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      out[outOffset + 11] = i11;
	      out[outOffset + 12] = i12;
	      out[outOffset + 13] = i13;
	      out[outOffset + 14] = i14;
	      out[outOffset + 15] = i15;
	      out[outOffset + 16] = i16;
	      out[outOffset + 17] = i17;
	      out[outOffset + 18] = i18;
	      out[outOffset + 19] = i19;
	      out[outOffset + 20] = i20;
	      out[outOffset + 21] = i21;
	      out[outOffset + 22] = i22;
	      out[outOffset + 23] = i23;
	      out[outOffset + 24] = i24;
	      out[outOffset + 25] = i25;
	      out[outOffset + 26] = i26;
	      out[outOffset + 27] = i27;
	      out[outOffset + 28] = i28;
	      out[outOffset + 29] = i29;
	      out[outOffset + 30] = i30;
	      out[outOffset + 31] = i31;
	      
	      inpos.add(129);
	      outpos.add(32);
	}
	
	//64 32bits
	protected static void fastunpack255(final byte[] in, IntWrapper inpos, final int[] out, IntWrapper outpos) {
	      final int inOffset = inpos.get() + 1;
	      final int outOffset = outpos.get();
	      
	      final int i0 = ((in[inOffset + 0] & 0xFF) << 24) | ((in[inOffset + 1] & 0xFF) << 16) | ((in[inOffset + 2] & 0xFF) << 8) | ((in[inOffset + 3] & 0xFF));
	      final int i1 = ((in[inOffset + 4] & 0xFF) << 24) | ((in[inOffset + 5] & 0xFF) << 16) | ((in[inOffset + 6] & 0xFF) << 8) | ((in[inOffset + 7] & 0xFF));
	      final int i2 = ((in[inOffset + 8] & 0xFF) << 24) | ((in[inOffset + 9] & 0xFF) << 16) | ((in[inOffset + 10] & 0xFF) << 8) | ((in[inOffset + 11] & 0xFF));
	      final int i3 = ((in[inOffset + 12] & 0xFF) << 24) | ((in[inOffset + 13] & 0xFF) << 16) | ((in[inOffset + 14] & 0xFF) << 8) | ((in[inOffset + 15] & 0xFF));
	      final int i4 = ((in[inOffset + 16] & 0xFF) << 24) | ((in[inOffset + 17] & 0xFF) << 16) | ((in[inOffset + 18] & 0xFF) << 8) | ((in[inOffset + 19] & 0xFF));
	      final int i5 = ((in[inOffset + 20] & 0xFF) << 24) | ((in[inOffset + 21] & 0xFF) << 16) | ((in[inOffset + 22] & 0xFF) << 8) | ((in[inOffset + 23] & 0xFF));
	      final int i6 = ((in[inOffset + 24] & 0xFF) << 24) | ((in[inOffset + 25] & 0xFF) << 16) | ((in[inOffset + 26] & 0xFF) << 8) | ((in[inOffset + 27] & 0xFF));
	      final int i7 = ((in[inOffset + 28] & 0xFF) << 24) | ((in[inOffset + 29] & 0xFF) << 16) | ((in[inOffset + 30] & 0xFF) << 8) | ((in[inOffset + 31] & 0xFF));
	      final int i8 = ((in[inOffset + 32] & 0xFF) << 24) | ((in[inOffset + 33] & 0xFF) << 16) | ((in[inOffset + 34] & 0xFF) << 8) | ((in[inOffset + 35] & 0xFF));
	      final int i9 = ((in[inOffset + 36] & 0xFF) << 24) | ((in[inOffset + 37] & 0xFF) << 16) | ((in[inOffset + 38] & 0xFF) << 8) | ((in[inOffset + 39] & 0xFF));
	      final int i10 = ((in[inOffset + 40] & 0xFF) << 24) | ((in[inOffset + 41] & 0xFF) << 16) | ((in[inOffset + 42] & 0xFF) << 8) | ((in[inOffset + 43] & 0xFF));
	      final int i11 = ((in[inOffset + 44] & 0xFF) << 24) | ((in[inOffset + 45] & 0xFF) << 16) | ((in[inOffset + 46] & 0xFF) << 8) | ((in[inOffset + 47] & 0xFF));
	      final int i12 = ((in[inOffset + 48] & 0xFF) << 24) | ((in[inOffset + 49] & 0xFF) << 16) | ((in[inOffset + 50] & 0xFF) << 8) | ((in[inOffset + 51] & 0xFF));
	      final int i13 = ((in[inOffset + 52] & 0xFF) << 24) | ((in[inOffset + 53] & 0xFF) << 16) | ((in[inOffset + 54] & 0xFF) << 8) | ((in[inOffset + 55] & 0xFF));
	      final int i14 = ((in[inOffset + 56] & 0xFF) << 24) | ((in[inOffset + 57] & 0xFF) << 16) | ((in[inOffset + 58] & 0xFF) << 8) | ((in[inOffset + 59] & 0xFF));
	      final int i15 = ((in[inOffset + 60] & 0xFF) << 24) | ((in[inOffset + 61] & 0xFF) << 16) | ((in[inOffset + 62] & 0xFF) << 8) | ((in[inOffset + 63] & 0xFF));
	      final int i16 = ((in[inOffset + 64] & 0xFF) << 24) | ((in[inOffset + 65] & 0xFF) << 16) | ((in[inOffset + 66] & 0xFF) << 8) | ((in[inOffset + 67] & 0xFF));
	      final int i17 = ((in[inOffset + 68] & 0xFF) << 24) | ((in[inOffset + 69] & 0xFF) << 16) | ((in[inOffset + 70] & 0xFF) << 8) | ((in[inOffset + 71] & 0xFF));
	      final int i18 = ((in[inOffset + 72] & 0xFF) << 24) | ((in[inOffset + 73] & 0xFF) << 16) | ((in[inOffset + 74] & 0xFF) << 8) | ((in[inOffset + 75] & 0xFF));
	      final int i19 = ((in[inOffset + 76] & 0xFF) << 24) | ((in[inOffset + 77] & 0xFF) << 16) | ((in[inOffset + 78] & 0xFF) << 8) | ((in[inOffset + 79] & 0xFF));
	      final int i20 = ((in[inOffset + 80] & 0xFF) << 24) | ((in[inOffset + 81] & 0xFF) << 16) | ((in[inOffset + 82] & 0xFF) << 8) | ((in[inOffset + 83] & 0xFF));
	      final int i21 = ((in[inOffset + 84] & 0xFF) << 24) | ((in[inOffset + 85] & 0xFF) << 16) | ((in[inOffset + 86] & 0xFF) << 8) | ((in[inOffset + 87] & 0xFF));
	      final int i22 = ((in[inOffset + 88] & 0xFF) << 24) | ((in[inOffset + 89] & 0xFF) << 16) | ((in[inOffset + 90] & 0xFF) << 8) | ((in[inOffset + 91] & 0xFF));
	      final int i23 = ((in[inOffset + 92] & 0xFF) << 24) | ((in[inOffset + 93] & 0xFF) << 16) | ((in[inOffset + 94] & 0xFF) << 8) | ((in[inOffset + 95] & 0xFF));
	      final int i24 = ((in[inOffset + 96] & 0xFF) << 24) | ((in[inOffset + 97] & 0xFF) << 16) | ((in[inOffset + 98] & 0xFF) << 8) | ((in[inOffset + 99] & 0xFF));
	      final int i25 = ((in[inOffset + 100] & 0xFF) << 24) | ((in[inOffset + 101] & 0xFF) << 16) | ((in[inOffset + 102] & 0xFF) << 8) | ((in[inOffset + 103] & 0xFF));
	      final int i26 = ((in[inOffset + 104] & 0xFF) << 24) | ((in[inOffset + 105] & 0xFF) << 16) | ((in[inOffset + 106] & 0xFF) << 8) | ((in[inOffset + 107] & 0xFF));
	      final int i27 = ((in[inOffset + 108] & 0xFF) << 24) | ((in[inOffset + 109] & 0xFF) << 16) | ((in[inOffset + 110] & 0xFF) << 8) | ((in[inOffset + 111] & 0xFF));
	      final int i28 = ((in[inOffset + 112] & 0xFF) << 24) | ((in[inOffset + 113] & 0xFF) << 16) | ((in[inOffset + 114] & 0xFF) << 8) | ((in[inOffset + 115] & 0xFF));
	      final int i29 = ((in[inOffset + 116] & 0xFF) << 24) | ((in[inOffset + 117] & 0xFF) << 16) | ((in[inOffset + 118] & 0xFF) << 8) | ((in[inOffset + 119] & 0xFF));
	      final int i30 = ((in[inOffset + 120] & 0xFF) << 24) | ((in[inOffset + 121] & 0xFF) << 16) | ((in[inOffset + 122] & 0xFF) << 8) | ((in[inOffset + 123] & 0xFF));
	      final int i31 = ((in[inOffset + 124] & 0xFF) << 24) | ((in[inOffset + 125] & 0xFF) << 16) | ((in[inOffset + 126] & 0xFF) << 8) | ((in[inOffset + 127] & 0xFF));

	      final int i32 = ((in[inOffset + 128] & 0xFF) << 24) | ((in[inOffset + 129] & 0xFF) << 16) | ((in[inOffset + 130] & 0xFF) << 8) | ((in[inOffset + 131] & 0xFF));
	      final int i33 = ((in[inOffset + 132] & 0xFF) << 24) | ((in[inOffset + 133] & 0xFF) << 16) | ((in[inOffset + 134] & 0xFF) << 8) | ((in[inOffset + 135] & 0xFF));
	      final int i34 = ((in[inOffset + 136] & 0xFF) << 24) | ((in[inOffset + 137] & 0xFF) << 16) | ((in[inOffset + 138] & 0xFF) << 8) | ((in[inOffset + 139] & 0xFF));
	      final int i35 = ((in[inOffset + 140] & 0xFF) << 24) | ((in[inOffset + 141] & 0xFF) << 16) | ((in[inOffset + 142] & 0xFF) << 8) | ((in[inOffset + 143] & 0xFF));
	      final int i36 = ((in[inOffset + 144] & 0xFF) << 24) | ((in[inOffset + 145] & 0xFF) << 16) | ((in[inOffset + 146] & 0xFF) << 8) | ((in[inOffset + 147] & 0xFF));
	      final int i37 = ((in[inOffset + 148] & 0xFF) << 24) | ((in[inOffset + 149] & 0xFF) << 16) | ((in[inOffset + 150] & 0xFF) << 8) | ((in[inOffset + 151] & 0xFF));
	      final int i38 = ((in[inOffset + 152] & 0xFF) << 24) | ((in[inOffset + 153] & 0xFF) << 16) | ((in[inOffset + 154] & 0xFF) << 8) | ((in[inOffset + 155] & 0xFF));
	      final int i39 = ((in[inOffset + 156] & 0xFF) << 24) | ((in[inOffset + 157] & 0xFF) << 16) | ((in[inOffset + 158] & 0xFF) << 8) | ((in[inOffset + 159] & 0xFF));
	      final int i40 = ((in[inOffset + 160] & 0xFF) << 24) | ((in[inOffset + 161] & 0xFF) << 16) | ((in[inOffset + 162] & 0xFF) << 8) | ((in[inOffset + 163] & 0xFF));
	      final int i41 = ((in[inOffset + 164] & 0xFF) << 24) | ((in[inOffset + 165] & 0xFF) << 16) | ((in[inOffset + 166] & 0xFF) << 8) | ((in[inOffset + 167] & 0xFF));
	      final int i42 = ((in[inOffset + 168] & 0xFF) << 24) | ((in[inOffset + 169] & 0xFF) << 16) | ((in[inOffset + 170] & 0xFF) << 8) | ((in[inOffset + 171] & 0xFF));
	      final int i43 = ((in[inOffset + 172] & 0xFF) << 24) | ((in[inOffset + 173] & 0xFF) << 16) | ((in[inOffset + 174] & 0xFF) << 8) | ((in[inOffset + 175] & 0xFF));
	      final int i44 = ((in[inOffset + 176] & 0xFF) << 24) | ((in[inOffset + 177] & 0xFF) << 16) | ((in[inOffset + 178] & 0xFF) << 8) | ((in[inOffset + 179] & 0xFF));
	      final int i45 = ((in[inOffset + 180] & 0xFF) << 24) | ((in[inOffset + 181] & 0xFF) << 16) | ((in[inOffset + 182] & 0xFF) << 8) | ((in[inOffset + 183] & 0xFF));
	      final int i46 = ((in[inOffset + 184] & 0xFF) << 24) | ((in[inOffset + 185] & 0xFF) << 16) | ((in[inOffset + 186] & 0xFF) << 8) | ((in[inOffset + 187] & 0xFF));
	      final int i47 = ((in[inOffset + 188] & 0xFF) << 24) | ((in[inOffset + 189] & 0xFF) << 16) | ((in[inOffset + 190] & 0xFF) << 8) | ((in[inOffset + 191] & 0xFF));
	      final int i48 = ((in[inOffset + 192] & 0xFF) << 24) | ((in[inOffset + 193] & 0xFF) << 16) | ((in[inOffset + 194] & 0xFF) << 8) | ((in[inOffset + 195] & 0xFF));
	      final int i49 = ((in[inOffset + 196] & 0xFF) << 24) | ((in[inOffset + 197] & 0xFF) << 16) | ((in[inOffset + 198] & 0xFF) << 8) | ((in[inOffset + 199] & 0xFF));
	      final int i50 = ((in[inOffset + 200] & 0xFF) << 24) | ((in[inOffset + 201] & 0xFF) << 16) | ((in[inOffset + 202] & 0xFF) << 8) | ((in[inOffset + 203] & 0xFF));
	      final int i51 = ((in[inOffset + 204] & 0xFF) << 24) | ((in[inOffset + 205] & 0xFF) << 16) | ((in[inOffset + 206] & 0xFF) << 8) | ((in[inOffset + 207] & 0xFF));
	      final int i52 = ((in[inOffset + 208] & 0xFF) << 24) | ((in[inOffset + 209] & 0xFF) << 16) | ((in[inOffset + 210] & 0xFF) << 8) | ((in[inOffset + 211] & 0xFF));
	      final int i53 = ((in[inOffset + 212] & 0xFF) << 24) | ((in[inOffset + 213] & 0xFF) << 16) | ((in[inOffset + 214] & 0xFF) << 8) | ((in[inOffset + 215] & 0xFF));
	      final int i54 = ((in[inOffset + 216] & 0xFF) << 24) | ((in[inOffset + 217] & 0xFF) << 16) | ((in[inOffset + 218] & 0xFF) << 8) | ((in[inOffset + 219] & 0xFF));
	      final int i55 = ((in[inOffset + 220] & 0xFF) << 24) | ((in[inOffset + 221] & 0xFF) << 16) | ((in[inOffset + 222] & 0xFF) << 8) | ((in[inOffset + 223] & 0xFF));
	      final int i56 = ((in[inOffset + 224] & 0xFF) << 24) | ((in[inOffset + 225] & 0xFF) << 16) | ((in[inOffset + 226] & 0xFF) << 8) | ((in[inOffset + 227] & 0xFF));
	      final int i57 = ((in[inOffset + 228] & 0xFF) << 24) | ((in[inOffset + 229] & 0xFF) << 16) | ((in[inOffset + 230] & 0xFF) << 8) | ((in[inOffset + 231] & 0xFF));
	      final int i58 = ((in[inOffset + 232] & 0xFF) << 24) | ((in[inOffset + 233] & 0xFF) << 16) | ((in[inOffset + 234] & 0xFF) << 8) | ((in[inOffset + 235] & 0xFF));
	      final int i59 = ((in[inOffset + 236] & 0xFF) << 24) | ((in[inOffset + 237] & 0xFF) << 16) | ((in[inOffset + 238] & 0xFF) << 8) | ((in[inOffset + 239] & 0xFF));
	      final int i60 = ((in[inOffset + 240] & 0xFF) << 24) | ((in[inOffset + 241] & 0xFF) << 16) | ((in[inOffset + 242] & 0xFF) << 8) | ((in[inOffset + 243] & 0xFF));
	      final int i61 = ((in[inOffset + 244] & 0xFF) << 24) | ((in[inOffset + 245] & 0xFF) << 16) | ((in[inOffset + 246] & 0xFF) << 8) | ((in[inOffset + 247] & 0xFF));
	      final int i62 = ((in[inOffset + 248] & 0xFF) << 24) | ((in[inOffset + 249] & 0xFF) << 16) | ((in[inOffset + 250] & 0xFF) << 8) | ((in[inOffset + 251] & 0xFF));
	      final int i63 = ((in[inOffset + 252] & 0xFF) << 24) | ((in[inOffset + 253] & 0xFF) << 16) | ((in[inOffset + 254] & 0xFF) << 8) | ((in[inOffset + 255] & 0xFF));
	      
	      out[outOffset + 0] = i0;
	      out[outOffset + 1] = i1;
	      out[outOffset + 2] = i2;
	      out[outOffset + 3] = i3;
	      out[outOffset + 4] = i4;
	      out[outOffset + 5] = i5;
	      out[outOffset + 6] = i6;
	      out[outOffset + 7] = i7;
	      out[outOffset + 8] = i8;
	      out[outOffset + 9] = i9;
	      out[outOffset + 10] = i10;
	      out[outOffset + 11] = i11;
	      out[outOffset + 12] = i12;
	      out[outOffset + 13] = i13;
	      out[outOffset + 14] = i14;
	      out[outOffset + 15] = i15;
	      out[outOffset + 16] = i16;
	      out[outOffset + 17] = i17;
	      out[outOffset + 18] = i18;
	      out[outOffset + 19] = i19;
	      out[outOffset + 20] = i20;
	      out[outOffset + 21] = i21;
	      out[outOffset + 22] = i22;
	      out[outOffset + 23] = i23;
	      out[outOffset + 24] = i24;
	      out[outOffset + 25] = i25;
	      out[outOffset + 26] = i26;
	      out[outOffset + 27] = i27;
	      out[outOffset + 28] = i28;
	      out[outOffset + 29] = i29;
	      out[outOffset + 30] = i30;
	      out[outOffset + 31] = i31;
	      
	      out[outOffset + 32] = i32;
	      out[outOffset + 33] = i33;
	      out[outOffset + 34] = i34;
	      out[outOffset + 35] = i35;
	      out[outOffset + 36] = i36;
	      out[outOffset + 37] = i37;
	      out[outOffset + 38] = i38;
	      out[outOffset + 39] = i39;
	      out[outOffset + 40] = i40;
	      out[outOffset + 41] = i41;
	      out[outOffset + 42] = i42;
	      out[outOffset + 43] = i43;
	      out[outOffset + 44] = i44;
	      out[outOffset + 45] = i45;
	      out[outOffset + 46] = i46;
	      out[outOffset + 47] = i47;
	      out[outOffset + 48] = i48;
	      out[outOffset + 49] = i49;
	      out[outOffset + 50] = i50;
	      out[outOffset + 51] = i51;
	      out[outOffset + 52] = i52;
	      out[outOffset + 53] = i53;
	      out[outOffset + 54] = i54;
	      out[outOffset + 55] = i55;
	      out[outOffset + 56] = i56;
	      out[outOffset + 57] = i57;
	      out[outOffset + 58] = i58;
	      out[outOffset + 59] = i59;
	      out[outOffset + 60] = i60;
	      out[outOffset + 61] = i61;
	      out[outOffset + 62] = i62;
	      out[outOffset + 63] = i63;
	      
	      inpos.add(257);
	      outpos.add(64);
	}
}