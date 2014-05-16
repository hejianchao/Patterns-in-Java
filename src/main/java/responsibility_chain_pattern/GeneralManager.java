package responsibility_chain_pattern;

public class GeneralManager extends Handler {

	@Override
	public String handleFeeRequest(String user, double fee) {

		String str = "";
		// 总经理的权限很大，只要请求到了这里，他都可以处理
		System.out.println("我是总经理，这个事情我能搞定");
		if (fee >= 1000) {
			// 为了测试，简单点，只同意张三的请求
			if ("张三".equals(user)) {
				str = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			} else {
				// 其他人一律不同意
				str = "失败：总经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
			}
		} else {
			// 如果还有后继的处理对象，继续传递
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}

}