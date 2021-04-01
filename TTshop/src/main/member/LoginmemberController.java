@Slf4j
@Controller
public class memberConroller {
          
    private memberRepository member;
          
    public MemberConroller(MemberRepository member) {
        this.member = member;
    }

   @RequestMapping("/")
    public String login() {
        return "login";
    }
    @PostMapping("/signIn")
    public String signIn(String inputId, String inputPassword) {
        log.info("id : {} , pw : {}", inputId, inputPassword);
        Member member = this.member.findMember(inputId, inputPassword);
        if(member != null) {
            return "loginOK";
        }
        return "loginFail";
    }
}
