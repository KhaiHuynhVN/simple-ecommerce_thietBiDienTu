import classNames from "classnames/bind";

import Breadcrumbs from "../../components/Breadcrumbs";
import SectionWrapper from "../../components/SectionWrapper";
import ForgotPasswordForm from "./components/ForgotPasswordForm";
import BrandCarousel from "../../components/BrandCarousel";
import PostWidget from "../../components/PostWidget";
import routesConfig from "../../routesConfig";

import styles from "./ForgotPassword.module.scss";

const cx = classNames.bind(styles);

function ForgotPassword() {
   return (
      <div className={cx(`wrapper`, `mt-[1rem]`)}>
         <Breadcrumbs breadcrumbs={routesConfig.forgotPassword.breadcrumbs} routesConfig={routesConfig} />

         <div className={`mt-[1rem]`}>
            <SectionWrapper title="Cấp lại mật khẩu" leftIcon={<i className="bi bi-key-fill text-secondary-color"></i>}>
               <div className={`bg-white p-4`}>
                  <div className="flex justify-end text-[16px]">
                     <span className="text-thirtieth-color mr-2">*</span>
                     <span>là thông tin bắt buộc</span>
                  </div>
                  <ForgotPasswordForm />
               </div>
            </SectionWrapper>
         </div>

         <div className="mt-[1rem]">
            <BrandCarousel />
         </div>

         <div className={`mt-[1rem]`}>
            <PostWidget />
         </div>
      </div>
   );
}

export default ForgotPassword;
