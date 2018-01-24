package m13_Chain_of_Responsibility.demo1;

/**
 * Created by yuanjie.fang on 2018/1/24.
 */
public class ProjectManager extends Handler {
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            if ("张三".equals(user)) {
                str = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            } else {
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
